package com.zc.dao;

import com.zc.anno.zc;
import org.springframework.stereotype.Repository;

/**
 * @Description TODO
 * @Author LiquorSea
 * @Date 2019/10/7 18:54
 **/
@Repository
public final class IndexDaoImpl implements IndexDao {

    @zc
    @Override
    public void query1(Integer i){
        System.out.println("query1");
    }

    @Override
    public void query2(Integer i){
        System.out.println("query2");
    }

}
  
  
   