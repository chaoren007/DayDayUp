package com.zc.app;

import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import javax.servlet.annotation.HandlesTypes;
import java.util.Set;

/**
 * @Description TODO
 * @Author LiquorSea
 * @Date 2019/10/22 21:03
 **/
public class MyInitializer implements ServletContainerInitializer {
    @Override
    public void onStartup(Set<Class<?>> set, ServletContext servletContext) throws ServletException {
        System.out.println("===================MyInitializer====================");
        ServletRegistration.Dynamic registration = servletContext.addServlet("xxx", new SpringServlet());
        registration.addMapping("/");
    }
}
  
  
   