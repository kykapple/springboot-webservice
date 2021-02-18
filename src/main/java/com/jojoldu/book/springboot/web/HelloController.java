package com.jojoldu.book.springboot.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // @Controller + @ResponseBody ==> 클라이언트 요청 - DispatcherServlet과 Handler Mapping이 요청 intercept
                //                                      - Controller에 의해 요청을 처리하고 Controller에서 직접 데이터(자바 객체)
                //                                          를 HTTP 요청의 body 내용으로 매핑하는 역할을 함
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

}
