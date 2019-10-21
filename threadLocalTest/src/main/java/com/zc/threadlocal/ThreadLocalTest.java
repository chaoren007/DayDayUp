package com.zc.threadlocal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ThreadLocalTest {
    private static final ThreadLocal<List<String>> threadLocal = new ThreadLocal<List<String>>(){
        @Override
        protected List<String> initialValue() {
            LinkedList<String> linkedList = new LinkedList();
            linkedList.add("我是默认值");
            return linkedList;
        }
    };
//    private static final ThreadLocal<List<String>> threadLocal = new NoName();

//    ArrayList<String> list = new ArrayList<String>(){
//        @Override
//        protected String initialValue() {
//            LinkedList<String> linkedList = new LinkedList();
//            linkedList.add("我是默认值");
//            return "我是默认值";
//        }
//    };
    public void setThreadLocalValue(List<String> value) {
        threadLocal.set(value);
    }
    public void getThreadLocalValue() {
        List<String> strings = threadLocal.get();
        if (strings!=null && !strings.isEmpty()) {
            strings.forEach(name -> System.out.println(Thread.currentThread().getName() + "###" + name));
        }
    }
    public static void main(String[] args) throws InterruptedException {
        final ThreadLocalTest t = new ThreadLocalTest();
        List<String> strs = new ArrayList<>();
//                strs.add("1");
//                strs.add("2");
//                strs.add("3");
                t.setThreadLocalValue(strs);
                t.getThreadLocalValue();
//        Thread t1 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                List<String> strs = new ArrayList<>();
//                strs.add("1");
//                strs.add("2");
//                strs.add("3");
//                t.setThreadLocalValue(strs);
//                t.getThreadLocalValue();
//            }
//        }, "t1");
//        Thread t2 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                try {
//                    t1.join();
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                List<String> strs = new ArrayList<>();
//                strs.add("a");
//                strs.add("b");
//                t.setThreadLocalValue(strs);
//                t.getThreadLocalValue();
//
//            }
//        }, "t2");
//        t1.start();
//        t2.start();
    }
}