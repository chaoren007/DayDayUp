package com.zc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * <p> @TODO <p>
 * <p>Author: LiquorSea</p>
 * <p>Version: 1.0.0</p>
 * <p>Create Date：2019/10/17</p>
 * <p>Modified By：LiquorSea</p>
 * <p>Modified Date: 2019/10/17 </p>
 * <p>Copyright (c) 2018 ~ 2019 Allchips版权所有</p>
 */
@SpringBootApplication
@MapperScan("com.zc.dao")
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class);
    }
}
