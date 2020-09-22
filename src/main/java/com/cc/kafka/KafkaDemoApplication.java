package com.cc.kafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description
 *
 * @author wangchen
 * @createDate 2020/9/14
 **/
@SpringBootApplication
@RestController
public class KafkaDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(KafkaDemoApplication.class,args);
    }

    @RequestMapping("/test")
    public String test(){
        return "test";
    }

}
