package blockingQueue;

import bean.Student;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * <p>Author: LiquorSea</p>
 * <p>Version: 1.0.0</p>
 * <p>Create Date：2019/12/5</p>
 * <p>Modified By：LiquorSea</p>
 * <p>Modified Date: 2019/12/5 </p>
 * <p>Copyright (c) 2018 ~ 2019 Allchips版权所有</p>
 */
public class Main {

    public static BlockingQueue<Integer> blockingQueue;

    static {
        blockingQueue = new ArrayBlockingQueue<>(10);
    }

    public static void main(String[] args) {
        Thread customer = new Thread(new Runnable() {
            @Override
            public void run() {
                int i = 0;
                while (true) {
                    try {
                        Thread.sleep(1000 * 3);
                        blockingQueue.offer(i);
                        System.out.println(Thread.currentThread().getName() + ": " + i++);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }

            }
        },"消费者");

        Thread product = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(1000 * 1);
                        //Integer take = blockingQueue.take();
                        Integer take = blockingQueue.poll();
                        System.out.println(Thread.currentThread().getName() + ": " + take);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        },"生产者");
        product.start();
        customer.start();
        Thread monitor = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(1000 * 1);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    Integer peek = blockingQueue.peek();
                    System.out.println("peek:" + peek);
                }
            }
        },"monitor");
        monitor.start();
    }
}
