package com.easyzero.springboot.web;

import com.easyzero.springboot.web.dto.HelloResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController     // 해당 컨트롤러를 JSON 반환하는 컨트롤러로 지정. 각 메서드마다 @ResponseBody 선언을 한 번에 가능
public class HelloController {

    @GetMapping("/hello")   // HTTP Method GET API
    public String hello() {
        return "hello";
    }

    @GetMapping("/hello/dto")
    public HelloResponseDto helloDto(@RequestParam("name") String name, @RequestParam("amount") int amount) {
        // @RequestParam - 외부에서 API 로 넘긴 파라미터 가져옴
        return new HelloResponseDto(name, amount);
    }
}
