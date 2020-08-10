package com.zc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description TODO
 * @Author LiquorSea
 * @Date 2019/9/28 16:03
 **/

@Service
public class IndexServiceA {

    @Autowired
    private IndexDao dao;

    private IndexServiceB indexServiceB;

    @Autowired
    public IndexServiceA(IndexServiceB indexServiceB) {
        this.indexServiceB = indexServiceB;
    }

    public void service(){
        indexServiceB.service();
        System.out.println(this.getClass().getSimpleName() + ":" + dao.query());
    }
}
  
  
   