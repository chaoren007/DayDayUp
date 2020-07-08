import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author Sea
 */
public class Main {
    private static final int THREAD = 1 << 4;
    public static void main(String[] args) throws InterruptedException {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap<>(32);
        for(int i = 0; i< THREAD; i++) {
           new Thread(new Runnable() {
               @Override
               public void run() {
                   concurrentHashMap.put(Thread.currentThread(), Thread.currentThread());
               }
           }).start();
        }
        Thread.sleep(1000);
        for (Object obj : concurrentHashMap.keySet()) {
            System.out.println(concurrentHashMap.get(obj));
        }
    }
}
