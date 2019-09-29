package com.zc.controller;

import com.zc.annotation.MyAutowired;
import com.zc.annotation.MyController;
import com.zc.annotation.MyRequestMapping;
import com.zc.annotation.MyRequestParam;
import com.zc.service.TestService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Description：
 * Author：CXJ
 * Date： 2018-06-16 18:39
 * Remark：
 */
@MyController()
@MyRequestMapping("test1")
public class Test1Controller {

    @MyAutowired
    private TestService testService;

    @MyRequestMapping("test")
    public void myTest(HttpServletRequest request, HttpServletResponse response,
                       @MyRequestParam("param") String param) {
        try {
            response.getWriter().write("Test1Controller:the param you send is :" + param);
            testService.printParam(param);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}