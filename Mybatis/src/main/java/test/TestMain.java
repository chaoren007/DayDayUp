/**
 *
 */
package test;


import com.zc.mybatis.session.SqlSession;
import com.zc.mybatis.session.SqlSessionFactory;
import com.zc.mybatis.session.SqlSessionFactoryBuilder;
import test.bean.CrmContacts;
import test.dao.ICrmContactsDao;

import java.util.List;


/**
 * TestMain.java
 *
 * @author ZC
 * @date 2019年3月6日
 */
public class TestMain {

    public static void main(String[] args) throws Exception {

        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build("conf.properties");
        SqlSession session = factory.openSession();

        ICrmContactsDao contactsDao = session.getMapper(ICrmContactsDao.class);
        CrmContacts contacts = contactsDao.getCrmContactsById();
        System.out.println("******* " + contacts.toString());
    }
}
