package com.zc.controller;

import com.zc.api.BrandDTO;
import com.zc.api.BrandFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SimpleController {

    @Autowired
    private BrandFacade brandFacade;


    @RequestMapping(value = "/sayHello")
    public String sayHello(){
        return "Hello!";
    }


    @RequestMapping(value = "/test")
    public List<BrandDTO> test(){
        BrandDTO dto = new BrandDTO();
        List<BrandDTO> brandDTOS = brandFacade.queryList(dto);
        return brandDTOS;
    }

}
