package com.yule;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author:yl
 * @Date:2019/6/16 22:18
 * @Version 1.0
 */
@SpringBootApplication//该注解放到哪个类，该类就是springboot的起步类
public class MyApplication {
    public static void main(String[] args) {
        SpringApplication.run(MyApplication.class,args);
    }
}
