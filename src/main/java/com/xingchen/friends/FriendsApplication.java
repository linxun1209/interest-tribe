package com.xingchen.friends;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;

@SpringBootApplication
@MapperScan("com.xingchen.friends.mapper")

public class FriendsApplication {

    public static void main(String[] args) {
        SpringApplication.run(FriendsApplication.class, args);
    }

}
