package service;

/**
 * @Description TODO
 * @Author LiquorSea
 * @Date 2019/9/8 21:15
 **/
public class TestServiceImpl implements TestService {
    @Override
    public void printParam(String param) {
        System.out.println("接收到的参数为： "+param);
    }
}
  
  
   