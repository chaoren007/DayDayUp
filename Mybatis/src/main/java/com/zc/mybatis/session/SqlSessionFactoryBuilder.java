/**
 *
 */
package com.zc.mybatis.session;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.stream.Stream;

import com.zc.mybatis.session.defaults.DefaultSqlSessionFactory;


/**
 * SqlSessionFactoryBuilder.java
 *
 * @author PLF
 * @date 2019年3月7日
 */
public class SqlSessionFactoryBuilder {

    /**
     * build
     *
     * @param fileName
     * @return
     * @see
     */
    public SqlSessionFactory build(String fileName) {

        InputStream inputStream = SqlSessionFactoryBuilder.class.getClassLoader().getResourceAsStream(fileName);
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
//        try {
//            while (true) {
//                String s = reader.readLine();
//                System.out.println(s);
//            }
//        } catch (Exception e) {
//
//        }
        return build(inputStream);
    }

    /**
     * build
     *
     * @param inputStream
     * @return
     * @see
     */
    public SqlSessionFactory build(InputStream inputStream) {
        try {
            Configuration.PROPS.load(inputStream);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return new DefaultSqlSessionFactory(new Configuration());
    }
}
