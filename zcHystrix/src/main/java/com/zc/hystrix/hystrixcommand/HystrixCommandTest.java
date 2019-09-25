package com.zc.hystrix.hystrixcommand;

import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;
import com.netflix.hystrix.HystrixCommandProperties;
import org.junit.Before;
import org.junit.Test;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Description TODO
 * @Author LiquorSea
 * @Date 2019/9/24 10:27
 **/
public class HystrixCommandTest {

    private static final SimpleDateFormat df = new SimpleDateFormat("HH:mm:ss");
    //http请求超时时
    private static final int HTTP_TIMEOUT = 3000;
    //hystrix
    private  static final int HYSTRIX_TIMEOUT = 10000;

    private RestTemplate restTemplate;

    @Before
    public void init() {
        HttpComponentsClientHttpRequestFactory  httpRequestFactory = new HttpComponentsClientHttpRequestFactory();
        httpRequestFactory.setReadTimeout(HTTP_TIMEOUT);
        restTemplate = new RestTemplate(httpRequestFactory);
    }

    @Test
    public void test(){
        //创建HystrixCommand.Setter
        HystrixCommandProperties.Setter  propSetter = HystrixCommandProperties
                .Setter()
                    .withExecutionTimeoutEnabled(true)
                        .withExecutionTimeoutInMilliseconds(HYSTRIX_TIMEOUT)
                            .withExecutionIsolationStrategy(HystrixCommandProperties.ExecutionIsolationStrategy.THREAD)
                                .withExecutionIsolationThreadInterruptOnTimeout(true);
        HystrixCommand.Setter setter = HystrixCommand.Setter
                .withGroupKey(HystrixCommandGroupKey.Factory.asKey("queryData"))
                .andCommandPropertiesDefaults(propSetter);
        //通过Setter创建HystrixCommand
        HystrixCommand<String> hystrixCommand = new HystrixCommand<String>(setter) {
            @Override
            protected String run() throws Exception {
                //发起http请求
                print("send request");
                String result = restTemplate.getForObject("http://127.0.0.1:8080/queryData",String.class);
                print("get response:"+result);
                return result;
            }
            @Override
            protected  String getFallback(){
                print("fallback");
                return  null;
            }
        };
        print("execute command");
        //执行HystrixCommand
        String result= hystrixCommand.execute();
        print("get result="+result);
        while(true){
        }
    }
    private void print(String msg) {
        System.out.println(df.format(new Date()) + " [" + Thread.currentThread().getName() + "]：" + "========================"+msg+"========================");
    }
}
  
  
   