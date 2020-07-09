/**
 * @author Sea
 */
public class Main {
    private static final int THREAD = 1 << 10;
    public static void main(String[] args) throws InterruptedException {
        final Stu stu = new Stu(100);
        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i< THREAD; i++) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    new Thread(new Runnable() {
                        @Override
                        public void run() {
                            System.out.println(stu.score);
                            stu.score = 77;
                        }
                    }).start();
                }
            }
        }).start();

        while (true) {
            Thread.sleep(2000);
            System.out.println("===" + stu.score);
            stu.score = 88;
        }
    }

}

class Stu{
    public int score = 99;
    public Stu(int score) {
        this.score = score;
    }

}
