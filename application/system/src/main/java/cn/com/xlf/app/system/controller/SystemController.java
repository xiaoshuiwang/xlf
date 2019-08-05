package cn.com.xlf.app.system.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 系统controller
 */
@RestController
public class SystemController {

    @GetMapping
    public String hello(){
        return "hello world!";
    }
}
