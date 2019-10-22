package com.zc.app;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.URL;

/**
 * @Description TODO
 * @Author LiquorSea
 * @Date 2019/10/22 22:01
 **/
public class SpringServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // -- index.html
        URL resource = SpringServlet.class.getResource("/");
        String basePath = request.getRequestURI();
        String requestURI = request.getRequestURI();
        String path = resource + requestURI;
        File file = new File(path);
        InputStream inputStream = new FileInputStream(file);
        byte[] bytes = new byte[2048];
        inputStream.read(bytes);
        String str = new String(bytes);
        System.out.println(str);
        response.getOutputStream().write(bytes);
        response.getOutputStream().close();
    }
}
  
  
   