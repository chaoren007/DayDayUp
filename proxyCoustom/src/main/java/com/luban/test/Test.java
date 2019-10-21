package com.luban.test;

import com.luban.dao.LubanDao;
import com.luban.dao.LubanDaoImpl;
import com.luban.dao.UserDao;
import com.luban.dao.UserDaoImpl;
import com.luban.proxy.MyInvocationHandler;
import com.luban.proxy.ProxyUtil;

import java.lang.reflect.Proxy;


public class Test {
    public static void main(String[] args) {


//        LubanDao proxy = (LubanDao) ProxyUtil.newInstance(new LubanDaoImpl());
//        proxy.query();

        //实例化目标类
        LubanDao target = new LubanDaoImpl();
        //生成代理类
        MyInvocationHandler handler = new MyInvocationHandler(target);
        //实例化代理类
        LubanDao dao = (LubanDao) Proxy.newProxyInstance(Test.class.getClassLoader(),target.getClass().getInterfaces(),handler);
        dao.query();
        System.out.println(dao.getClass().getName());

    }
}
