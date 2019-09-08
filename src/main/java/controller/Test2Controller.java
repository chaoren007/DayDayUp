package controller;

import annotation.MyController;
import annotation.MyRequestMapping;
import annotation.MyRequestParam;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author
 */
@MyController
@MyRequestMapping("test2")
public class Test2Controller {

    /**
     * do
     * @param request
     * @param response
     * @param param
     */
    @MyRequestMapping("test")
    public void myTest(HttpServletRequest request, HttpServletResponse response,
                       @MyRequestParam("param") String param) {
        try {
            response.getWriter().write("Test2Controller:the param you send is :" + param);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
  
   