package lock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/**
 * 通过AQS实现的互斥锁
 * <br/>
 * AQS: 用来构建锁或者其他同步组件的框架。它使用了一个int变量表示同步状态(更改状态使用CAS方式),通过内置的FIFO队列来完成资源获取线程的排队工作。
 *
 * 通过AQS实现自定义的同步组件一般步骤：
 * 0.继承AQS，然后根据实现同步的模式，覆写对应的方法。这些方法可以是独占的方式、共享的方式
 * 1.实现AQS的类需要调用compareAndSetState(),getState(),setState() 来进行状态的控制
 * 2.外部的同步组件类，实现Lock接口，然后通过AQS对应的模板方法区实现lock方法。
 * Created by Administrator on 2018/8/27.
 */
public class MutexLock implements Lock {

    private static final int LOCK = 1;
    private static final int UNLOCK = 0;

    private final Sync sync = new Sync();

    @Override
    public void lock() {
        sync.acquire(LOCK);
    }

    @Override
    public void lockInterruptibly() throws InterruptedException {
        sync.acquireInterruptibly(LOCK);
    }

    @Override
    public boolean tryLock() {
        return sync.tryAcquire(LOCK);
    }

    @Override
    public boolean tryLock(long time, TimeUnit unit) throws InterruptedException {
        return false;
    }

    @Override
    public void unlock() {
        sync.release(UNLOCK);
    }

    @Override
    public Condition newCondition() {
        return sync.newCondition();
    }

    public boolean isLock() {
        return sync.isHeldExclusively();
    }

    /**
     * 一般同步器都使用静态内部类去控制外部类的状态
     */
    private static class Sync extends AbstractQueuedSynchronizer {
        /**
         * 独占模式
         * *
         */
        // 获取锁
        @Override
        protected boolean tryAcquire(int arg) {
            if (compareAndSetState(UNLOCK, LOCK)) { //状态为0的时候获取锁
                setExclusiveOwnerThread(Thread.currentThread());
                return true;
            }
            return false;
        }

        //释放锁
        @Override
        protected boolean tryRelease(int arg) {
            if (getState() == UNLOCK) throw new IllegalMonitorStateException();
            setExclusiveOwnerThread(null);
            setState(UNLOCK);
            return true;
        }

        //锁是否被占用
        @Override
        protected boolean isHeldExclusively() {
            return getState() == LOCK;
        }

/*        //共享模式
        @Override
        protected int tryAcquireShared(int arg) {
            return super.tryAcquireShared(arg);
        }
        @Override
        protected boolean tryReleaseShared(int arg) {
            return super.tryReleaseShared(arg);
        }*/

        final ConditionObject newCondition() {
            return new ConditionObject();
        }

    }

}