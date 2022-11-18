package com.easyzero.springboot.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController     // 해당 컨트롤러를 JSON 반환하는 컨트롤러로 지정. 각 메서드마다 @ResponseBody 선언을 한 번에 가능
public class HelloController {
    @GetMapping("/hello")   // HTTP Method GET API
    public String hello() {
        return "hello";
    }
}
