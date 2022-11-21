package com.easyzero.springboot;

import com.easyzero.springboot.web.HelloController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.CoreMatchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)    // 테스트 실행 시 SpringRunner 실행자 실행 (Junit - 스프링부트테스트 사이 연결자)
@WebMvcTest(controllers = HelloController.class)      // Web(Spring MVC) 에 집중할 수 있는 어노테이션 (?)
public class HelloControllerTest {
    
    @Autowired    // 스프링이 관리하는 Bean 주입 (?)
    private MockMvc mvc;    // 웹 API 테스트 시 사용, MVC test entrypoint.

    @Test
    public void ReturnHello() throws Exception {
        String hello = "hello";

        mvc.perform(get("/hello"))    // MockMvc 를 통해 /hello url 로 HTTP GET 요청 (체이닝 지원. 연속 가능)
                .andExpect(status().isOk())     // status 결과 검증
                .andExpect(content().string(hello));    // response 내용 검증
    }

    @Test
    public void ReturnHelloDto() throws Exception {
        String name = "hello";
        int amount = 1000;

        mvc.perform(
                get("/hello/dto")
                        .param("name", name)
                        .param("amount", String.valueOf(amount))
        )
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.name", is(name)))
                .andExpect(jsonPath("$.amount", is(amount)));

    }

}
