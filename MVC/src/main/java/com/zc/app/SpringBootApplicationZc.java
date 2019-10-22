package com.zc.app;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.WebResourceRoot;
import org.apache.catalina.core.StandardContext;
import org.apache.catalina.startup.Tomcat;
import org.apache.catalina.webresources.DirResourceSet;
import org.apache.catalina.webresources.StandardRoot;

import javax.servlet.ServletException;
import java.io.File;

/**
 * @Description TODO
 * @Author LiquorSea
 * @Date 2019/10/22 21:22
 **/
public class SpringBootApplicationZc {
    public static void run() throws LifecycleException, ServletException, InterruptedException {
        Tomcat tomcat = new Tomcat();
        tomcat.setPort(9080);

        String sourcePath = SpringBootApplicationZc.class.getResource("/").getPath();

        //告诉tomcat你的源码在哪里
        System.out.println(new File("MVC/src/main/webapp").getAbsolutePath());
        Context context = tomcat.addWebapp("/", new File("MVC/src/main/webapp").getAbsolutePath());
        WebResourceRoot resourceRoot = new StandardRoot(context);
        resourceRoot.addPreResources(new DirResourceSet(resourceRoot,"/WEB-INF/classes",sourcePath,"/"));
        context.setResources(resourceRoot);
        tomcat.start();
        tomcat.getServer().await();
    }
}
  
  
   