package com.zc;

import com.zc.bean.CrmContacts;
import com.zc.dao.TestDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * <p> @TODO <p>
 * <p>Author: LiquorSea</p>
 * <p>Version: 1.0.0</p>
 * <p>Create Date：2019/10/17</p>
 * <p>Modified By：LiquorSea</p>
 * <p>Modified Date: 2019/10/17 </p>
 * <p>Copyright (c) 2018 ~ 2019 Allchips版权所有</p>
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Main.class)
public class TestService {
    @Autowired
    private TestDao dao;

    @Test
    public void test(){
        CrmContacts query = new CrmContacts();
        List<CrmContacts> followUserList = dao.getFollowUserList(query);
        System.out.println(followUserList);
    }
}
