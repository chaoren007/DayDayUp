import sun.misc.Unsafe;

import java.lang.reflect.Field;

/**
 * @author Sea
 */
public class StringTest {

    private static java.lang.String str = "123456";

    public static void main(String[] args) {

         final Unsafe unsafe = getUnsafe();

        System.out.println(str.hashCode());
        str = "998998";
        System.out.println(str.hashCode());
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

}
