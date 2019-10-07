package com.zc.test;

import com.zc.entity.CityEntity;
import com.zc.util.CommUtil;

/**
 * @Description TODO
 * @Author LiquorSea
 * @Date 2019/10/7 10:54
 **/
public class Main {
    public static void main(String[] args) {
        CityEntity entity = new CityEntity();
        entity.setId("1");
        entity.setName("supper man");
        String sql = CommUtil.buildQueryEntity(entity);
        System.out.println(sql);
    }
}
  
  
   