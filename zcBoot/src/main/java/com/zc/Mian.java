package com.zc;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.zc.controller.KingSourceWare;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Mian {

    public static void main(String[] args) {
        File file = new File("./param.txt");
        List<KingSourceWare> list = new ArrayList(5000);
        for (int i = 0; i < 5000; i++) {
            KingSourceWare ware = new KingSourceWare();
            ware.setPartNumber("JSW" + i);
            ware.setThirdpartyPartNumber("JSW-CODE" + i);
            ware.setBrandName("JWS-BRANDNAME" + i);
            ware.setCategoryName("JWS-CATEGORY" + i);
            ware.setBatchNumber("JSW");
            ware.setMoq("1");
            ware.setMpq("1");
            ware.setMultiple(1);
            ware.setQuoteDays(10);
            ware.setPackageFlag(20);
            ware.setStock(998);
            list.add(ware);
        }







    }
}
