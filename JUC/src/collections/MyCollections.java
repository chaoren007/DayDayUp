package collections;

import sun.misc.Unsafe;

import java.io.IOException;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * @author Sea
 */
public class MyCollections {

    private static final Unsafe unsafe = Unsafe.getUnsafe();
    private static final long stateOffset;
    private static final long headOffset;
    private static final long tailOffset;

    static {
        try {
            stateOffset = unsafe.objectFieldOffset
                    (MyCollections.class.getDeclaredField("state"));
            headOffset = unsafe.objectFieldOffset
                    (MyCollections.class.getDeclaredField("head"));
            tailOffset = unsafe.objectFieldOffset
                    (MyCollections.class.getDeclaredField("tail"));
        } catch (Exception ex) { throw new Error(ex); }
    }


    public static void main(String[] args) throws IOException {
        System.out.println(stateOffset);
        System.out.println(headOffset);
        System.out.println(tailOffset);
        //System.out.println(unsafe.compareAndSwapInt(this, stateOffset, 0, 1));
    }

    private synchronized static void queueTest() throws IOException {
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(3);
        arrayBlockingQueue.add(new MyCollections());
        arrayBlockingQueue.add(new MyCollections());
        arrayBlockingQueue.add(new MyCollections());
        System.in.read();
    }
}
