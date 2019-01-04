package com.yiqu.qurecover;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement//启动事务注解
@MapperScan("com.yiqu.qurecover.dao")//指定需要映射到Mybatis的包
public class QuRecoverApplication {

    public static void main(String[] args) {
        SpringApplication.run(QuRecoverApplication.class, args);
    }

}

