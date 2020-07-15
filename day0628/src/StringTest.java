import sun.misc.Unsafe;

import java.io.IOException;
import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;
import java.lang.reflect.Field;
import java.util.logging.Level;

/**
 * @author Sea
 */
public class StringTest {
    static final Unsafe unsafe = getUnsafe();
    private static java.lang.String str = "123456";
    static final boolean is64bit = true;
    public static void main(String[] args) throws IOException {

        new Thread(new Runnable() {
            @Override
            public void run() {
                printAddresses("Address", str);
            }
        }).start();
        ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
        ThreadInfo[] threadInfoArray=threadMXBean.dumpAllThreads(false, false);
        //循环打印
        for(ThreadInfo threadInfo:threadInfoArray) {
            System.out.println("threadId-->" + threadInfo.getThreadId() + "===threadName-->"+threadInfo.getThreadName());
        }
        str = "998";
        System.out.println(str.hashCode());
        printAddresses("Address", str);
        str = "998";
        System.out.println(str.hashCode());
        printAddresses("Address", str);
        str = new String("998");
        System.out.println(str.hashCode());
        printAddresses("Address", str);
        str = new String("998");
        System.out.println(str.hashCode());
        printAddresses("Address", str);
        System.out.println("开始阻塞......");
        System.in.read();
        System.out.println("=================");

    }
    private static Unsafe getUnsafe() {
        try {
            Field theUnsafe = Unsafe.class.getDeclaredField("theUnsafe");
            theUnsafe.setAccessible(true);
            return (Unsafe) theUnsafe.get(null);
        } catch (Exception e) {
            throw new AssertionError(e);
        }
    }

    @SuppressWarnings("deprecation")
    public synchronized static void printAddresses(String label, Object... objects) {
        System.out.print(label + ":         0x");
        long last;
        int offset = unsafe.arrayBaseOffset(objects.getClass());
        int scale = unsafe.arrayIndexScale(objects.getClass());
        switch (scale) {
            case 4:
                long factor = is64bit ? 8 : 1;
                final long i1 = (unsafe.getInt(objects, offset) & 0xFFFFFFFFL) * factor;
                System.out.print(Long.toHexString(i1));
                last = i1;
                for (int i = 1; i < objects.length; i++) {
                    final long i2 = (unsafe.getInt(objects, offset + i * 4) & 0xFFFFFFFFL) * factor;
                    if (i2 > last) {
                        System.out.print(", +" + Long.toHexString(i2 - last));
                    }
                    else {
                        System.out.print(", -" + Long.toHexString(last - i2));
                    }
                    last = i2;
                }
                break;
            case 8:
                throw new AssertionError("Not supported");
        }
        System.out.println();
    }

}
