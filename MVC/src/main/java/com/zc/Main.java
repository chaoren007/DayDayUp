package com.zc;

import com.zc.app.SpringBootApplicationZc;
import org.apache.catalina.LifecycleException;

import javax.servlet.ServletException;
import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeSet;
import java.util.concurrent.locks.Lock;


/**
 * @Description TODO
 * @Author LiquorSea
 * @Date 2019/10/22 21:40
 **/
public class Main {
    public static void main(String[] args) throws ServletException, InterruptedException, LifecycleException {
// ==================================HashMap=========================================
//        //第一个参数为初始值，第二个参数为负载系数，由内部代码确定初始阀值
//        HashMap<Integer, Main> map = new HashMap(4);
////        Main main1 = new Main();
////        Main main2 = new Main();
////        int h = main1.hashCode();
////        int hash_key = h ^ (h >>> 16);
//        map.put(0, new Main());
//        map.put(4, new Main());
//        map.put(8, new Main());
//        map.put(12, new Main());
//        System.currentTimeMillis();

// ==================================lambda========================================
        //lambda表达式 -- 内名内部类
        Comparator<Integer> cpt = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1,o2);
            }
        };
        // =======================================================
        Comparator<Integer> cpt2 = (x,y) -> Integer.compare(x,y);
        //函数式接口



        SpringBootApplicationZc.run();
    }
}
class Product{
    private String color;
    private Integer price;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
interface MyPredicate<T>{
    public boolean filter(T p);
}
  
  
   