package com.cb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.cb.shardingjdbc.mapper")
public class ShadingjdbcApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShadingjdbcApplication.class, args);
    }

}
