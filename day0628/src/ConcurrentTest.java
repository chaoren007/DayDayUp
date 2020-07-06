import sun.misc.Unsafe;

import java.lang.ref.PhantomReference;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author Administrator
 */
public class ConcurrentTest {


//
//    // Unsafe mechanics
//    private static final sun.misc.Unsafe U;
//    private static final long SIZECTL;
//    private static final long TRANSFERINDEX;
//    private static final long BASECOUNT;
//    private static final long CELLSBUSY;
////    private static final long CELLVALUE;
////    private static final long ABASE;
////    private static final int ASHIFT;
//    static {
//
//        try {
//            U = sun.misc.Unsafe.getUnsafe();
//            Class<?> k = ConcurrentTest.class;
//            SIZECTL = U.objectFieldOffset
//                    (k.getDeclaredField("sizeCtl"));
//            System.out.println(SIZECTL);
//            TRANSFERINDEX = U.objectFieldOffset
//                    (k.getDeclaredField("transferIndex"));
//            BASECOUNT = U.objectFieldOffset
//                    (k.getDeclaredField("baseCount"));
//            CELLSBUSY = U.objectFieldOffset
//                    (k.getDeclaredField("cellsBusy"));
////            Class<?> ck = ConcurrentHashMap.CounterCell.class;
////            CELLVALUE = U.objectFieldOffset
////                    (ck.getDeclaredField("value"));
////            Class<?> ak = ConcurrentHashMap.Node[].class;
////            ABASE = U.arrayBaseOffset(ak);
////            int scale = U.arrayIndexScale(ak);
////            if ((scale & (scale - 1)) != 0){
////                throw new Error("data type scale not a power of two");
////            }
////            ASHIFT = 31 - Integer.numberOfLeadingZeros(scale);
//        } catch (Exception e) {
//            throw new Error(e);
//        }
//    }

    static final int HASH_BITS = 0x7fffffff;
    static  int MIN = 0x00000000;

    public static void main(String[] args) {
        // PhantomReference p = new PhantomReference();

        test();
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap<>(32);
        final int NCPU = Runtime.getRuntime().availableProcessors();
        System.out.println(NCPU);

        HashMap hashMap = new HashMap(32);
        ConcurrentTest test = new ConcurrentTest();
        ConcurrentTest.spread(test.hashCode());
    }
    public static final int spread(int h) {
        System.out.println(Integer.toBinaryString(h));
        System.out.println(Integer.toBinaryString(h >>> 16) );
        // ^ 异或运算符
        System.out.println(Integer.toBinaryString(h ^ (h >>> 16)));
        System.out.println(HASH_BITS);
        return (h ^ (h >>> 16)) & HASH_BITS;
    }

    private static void test() {
        System.out.println(++MIN);
        test();
    }
}
