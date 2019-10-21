package com.zc.dao;

import com.zc.bean.CrmContacts;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TestDao {
    /**
     * @Notes: 根据跟进人名称模糊查询跟进人列表
     * @Author: liquorSea
     * @Create Date：2019/10/10 16:36
     * @param crmContacts 跟进人名称
     * @return
     */
    public List<CrmContacts> getFollowUserList(CrmContacts crmContacts);
}

