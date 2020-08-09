package com.chenshenglong.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement  //开启事务
@MapperScan("com.chenshenglong.springboot.mapper")
public class Ch04SpringbootMybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ch04SpringbootMybatisApplication.class, args);
    }

}
