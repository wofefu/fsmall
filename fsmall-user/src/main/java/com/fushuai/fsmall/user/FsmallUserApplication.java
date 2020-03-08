package com.fushuai.fsmall.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages={"com.fushuai.fsmall.user.repository"})
public class FsmallUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(FsmallUserApplication.class, args);
    }

}
