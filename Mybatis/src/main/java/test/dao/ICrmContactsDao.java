package test.dao;

import test.bean.CrmContacts;

import java.util.List;

/**
* <p>联系人接口</p>
* <p> 钟超 </p>
* <p>Version:1.0.0</p>
* <p>Create Date:2019-09-17 15:14:23 </p>
*/
public interface ICrmContactsDao {

   /**
   * 根据id查询CrmContacts对象
   * @param contactsId
   * @return 返回CrmContacts
   * @throws Exception
   */
   public CrmContacts getCrmContactsById(Long contactsId) throws Exception;

   /**
    * 根据条件查询CrmContacts列表
    * @param crmContacts
    * @return 返回CrmContacts列表
    * @throws Exception
    */
   public List<CrmContacts> getAll(CrmContacts crmContacts) throws Exception;
}

