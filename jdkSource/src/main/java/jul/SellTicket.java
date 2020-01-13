package jul;

import jdk.nashorn.internal.ir.Block;

import java.io.BufferedReader;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * <p> @TODO <p>
 * <p>Author: LiquorSea</p>
 * <p>Version: 1.0.0</p>
 * <p>Create Date：2019/12/5</p>
 * <p>Modified By：LiquorSea</p>
 * <p>Modified Date: 2019/12/5 </p>
 * <p>Copyright (c) 2018 ~ 2019 Allchips版权所有</p>
 */
public class SellTicket implements Runnable {

    private int ticketNum = 10;
    private Lock lock = new ReentrantLock();

    private boolean flag = true;

    @Override
    public void run() {
        sellTicket();
    }

    private void sellTicket() {
        while (flag) {
            try {
                lock.lock();
                if (ticketNum > 0) {
                    try {
                        Thread.sleep(1000 * 1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "正在售出第" + (ticketNum--) + "");
                } else {
                    flag = false;
                    System.out.println("票已售完，" + Thread.currentThread().getName() + "已关闭");
                }
            } finally {
                lock.unlock();
            }
        }
    }

    public static void main(String[] args) {
//        SellTicket sellTicket = new SellTicket();
//        Thread thread1 = new Thread(sellTicket, "窗口1");
//        Thread thread2 = new Thread(sellTicket, "窗口2");
//        Thread thread3 = new Thread(sellTicket, "窗口3");
//        thread1.start();
//        thread2.start();
//        thread3.start();
//        new Thread(() -> {
//            System.out.println("=============");
//        },"lambda").start();

        List<Integer> integers = Arrays.asList(1,2,3,4,5,6,7,87);
        printList(integers);
        List<Integer> collect = integers.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        printList(collect);
        List<Integer> limit = integers.stream().sorted().collect(Collectors.toList());
        printList(limit);
        List<Integer> map = integers.stream().map(i -> (i * i * i)).collect(Collectors.toList());
        printList(map);


    }

    private static void printList(List list){
        for (Object o : list) {
            System.out.print(o.toString() + " ");
        }
        System.out.println();
    }
}
