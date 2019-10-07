package com.zc.util;

import com.zc.anno.Entity;

import java.sql.SQLOutput;

/**
 * @Description TODO
 * @Author LiquorSea
 * @Date 2019/10/7 10:52
 **/
public class CommUtil {

    public  static  String buildQueryEntity(Object object){
        // select * from city where id = '1' and name = 'test'
        Class<?> classzz = object.getClass();
        System.out.println(classzz.isAnnotationPresent(Entity.class));
        return "";
    }
}
  
  
   