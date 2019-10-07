package com.zc.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @Description TODO
 * @Author LiquorSea
 * @Date 2019/10/7 18:03
 **/
@Configuration
@ComponentScan(value = "com.zc")
@EnableAspectJAutoProxy(proxyTargetClass = false)
public class AppConfig {


}
  
  
   