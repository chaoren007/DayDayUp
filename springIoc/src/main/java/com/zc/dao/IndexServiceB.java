package com.zc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description TODO
 * @Author LiquorSea
 * @Date 2019/9/28 16:03
 **/
@Service
public class IndexServiceB {

    @Autowired
    private IndexDao dao;

    private IndexServiceA indexServiceA;

    @Autowired
    public IndexServiceB(IndexServiceA indexServiceA) {
        this.indexServiceA = indexServiceA;
    }

    public void service(){
        System.out.println(indexServiceA.hashCode());
        System.out.println(this.getClass().getSimpleName() + ":" + dao.query());
    }
}
  
  
   