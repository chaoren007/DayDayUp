package com.zc.dao;

/**
 * @Description TODO
 * @Author LiquorSea
 * @Date 2019/9/28 16:03
 **/
public class IndexService {
    private  IndexDao dao;


    public IndexDao getDao() {
        return dao;
    }

    public void setDao(IndexDao dao) {
        this.dao = dao;
    }

    public void service(){
        dao.test();
    }
}
  
  
   