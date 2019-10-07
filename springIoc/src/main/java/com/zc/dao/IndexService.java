package com.zc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description TODO
 * @Author LiquorSea
 * @Date 2019/9/28 16:03
 **/

public class IndexService {
//    @Autowired
    private  IndexDao dao;
    public void service(){
        dao.test();
    }
    public void setDao(IndexDao dao) {
        this.dao = dao;
    }
}
  
  
   