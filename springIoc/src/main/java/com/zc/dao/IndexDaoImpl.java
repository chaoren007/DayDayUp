package com.zc.dao;

import org.springframework.stereotype.Component;

/**
 * @Description TODO
 * @Author LiquorSea
 * @Date 2019/9/28 16:01
 **/

//@Component(value = "dao")
public class IndexDaoImpl implements IndexDao {
    @Override
    public void test(){
        System.out.println("===impl0===");
    }
}