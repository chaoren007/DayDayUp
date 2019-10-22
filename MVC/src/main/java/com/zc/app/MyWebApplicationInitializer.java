package com.zc.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/**
 * @Description TODO
 * @Author LiquorSea
 * @Date 2019/10/20 22:07
 **/
public class MyWebApplicationInitializer{}
//public class MyWebApplicationInitializer implements WebApplicationInitializer {
//    @Override
//    public void onStartup(javax.servlet.ServletContext servletContext) throws ServletException {
//        System.out.println("================================");
//        AnnotationConfigWebApplicationContext app = new AnnotationConfigWebApplicationContext();
//        app.register(Appconfig.class);
//        app.refresh();
//        DispatcherServlet servlet = new DispatcherServlet(app);
//        ServletRegistration.Dynamic registration = servletContext.addServlet("servlet",servlet);
//        registration.addMapping("/");
//        registration.setLoadOnStartup(1);
//    }
//}
  
  
   