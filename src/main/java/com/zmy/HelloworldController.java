package com.zmy;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/11/2.
 */
@RestController
public class HelloworldController {

    @RequestMapping("/hello")
    public String helloworld(){
        return "hello world";
    }
}
