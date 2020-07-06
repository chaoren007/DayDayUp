import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author Sea
 */
public class LockTest {
    public static void main(String[] args) {
        Lock readWriteLock = new ReentrantLock(false);
        readWriteLock.lock();
        try{

        }catch (Exception e) {

        }finally {
            readWriteLock.unlock();
        }
    }
}
