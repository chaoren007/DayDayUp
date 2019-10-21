package com.luban.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * <p> 代理类，传入代理目标类 <p>
 * <p>Author: LiquorSea</p>
 * <p>Version: 1.0.0</p>
 * <p>Create Date：2019/10/9</p>
 * <p>Modified By：LiquorSea</p>
 * <p>Modified Date: 2019/10/9 </p>
 * <p>Copyright (c) 2018 ~ 2019 Allchips版权所有</p>
 */
public class MyInvocationHandler implements InvocationHandler {
    private Object target;
    public MyInvocationHandler(Object target){
        this.target = target;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before");
        Object returnValue = method.invoke(target, args);
        System.out.println("after");
        return returnValue;
    }
}
