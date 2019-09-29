package com.zc.mybatis;

/**
 * @Description TODO
 * @Author LiquorSea
 * @Date 2019/9/25 22:46
 **/

import java.lang.reflect.Proxy;

/**
 * @Author
 * 获取SqlSession对象<br>
 */
public class SqlSession {

    /**
     * 获取getMapper
     */
    public static <T> T getMapper(Class<T> clas)
            throws IllegalArgumentException {
        return (T) Proxy.newProxyInstance(clas.getClassLoader(), new Class[]{clas},
                new MyInvocationHandlerMbatis(clas));
    }
}
  
  
   