package com.zc.dao;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

/**
 * @Description TODO
 * @Author LiquorSea
 * @Date 2019/10/1 18:04
 **/
@Configurable
@ComponentScan(value = "com.zc")
@ImportResource(value = "classpath:spring.xml")
public class Spring {
}
  
  
   