package com.zc.threadlocal;

import java.util.LinkedList;
import java.util.List;

/**
 * <p> @TODO <p>
 * <p>Author: LiquorSea</p>
 * <p>Version: 1.0.0</p>
 * <p>Create Date：2019/10/16</p>
 * <p>Modified By：LiquorSea</p>
 * <p>Modified Date: 2019/10/16 </p>
 * <p>Copyright (c) 2018 ~ 2019 Allchips版权所有</p>
 */
public class NoName  extends ThreadLocal{
    @Override
    protected List<String> initialValue() {
        LinkedList<String> linkedList = new LinkedList();
        linkedList.add("我是默认值");
        return linkedList;
    }
}
