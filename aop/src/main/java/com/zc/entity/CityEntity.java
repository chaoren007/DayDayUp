package com.zc.entity;

import com.zc.anno.Entity;

/**
 * @Description TODO
 * @Author LiquorSea
 * @Date 2019/10/7 10:51
 **/
@Entity(value = "city")
public class CityEntity {

    private String id;
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
  
  
   