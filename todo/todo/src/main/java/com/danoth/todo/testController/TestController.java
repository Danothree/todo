package com.danoth.todo.testController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
//@RequestMapping("/test")
public class TestController {

//    @GetMapping
//    public String Test(){
//        return "hello world man~~~~";
//    }

    @GetMapping("/list")
    public String list() {
        return "list";
    }

}