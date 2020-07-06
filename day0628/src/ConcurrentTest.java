import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author Administrator
 */
public class ConcurrentTest {
    static final int HASH_BITS = 0x7fffffff;
    static  int MIN = 0x00000000;
    public static void main(String[] args) {
        // PhantomReference p = new PhantomReference();

        test();
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap<>(32);
        final int cpuNum = Runtime.getRuntime().availableProcessors();
        System.out.println(cpuNum);

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
