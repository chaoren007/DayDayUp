package com.zc.test;

import com.zc.config.AppConfig;
import com.zc.dao.IndexDao;
import com.zc.dao.IndexDaoImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.reflect.Proxy;

/**
 * @Description TODO
 * @Author LiquorSea
 * @Date 2019/10/7 21:43
 **/
public class Test {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(AppConfig.class);
        IndexDao dao = (IndexDao)app.getBean("indexDaoImpl");

        System.out.println(dao instanceof Proxy);

        dao.query1(1);
        dao.query2(2);
    }
}
  
  
   