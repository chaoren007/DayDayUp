/**
 * @Description TODO
 * @Author LiquorSea
 * @Date 2019/9/24 16:45
 **/
public class main {
    public static void main(String[] args) throws InterruptedException {
        MyThread A = new MyThread("A");
        MyThread B = new MyThread("B");
        MyThread C = new MyThread("C");
        A.start();
        B.run();
        C.run();
        A.join();
        B.join();
        C.join();
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("A");
    }

    public MyThread(String name) {
        super(name);
    }
}
  
   