package com.zc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description TODO
 * @Author LiquorSea
 * @Date 2019/9/28 16:03
 **/
@Service
public class IndexServiceC {

    @Autowired
    private  IndexDao dao;
    public void service(){

        System.out.println(this.getClass().getSimpleName() + ":" + dao.query());

    }
}
  
  
   