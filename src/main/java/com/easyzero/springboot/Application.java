package com.easyzero.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
프로젝트 메인 클래스 (EntryPoint)
 */

// @스프링부트 자동 설정, 스프링 Bean w/r 자동 설정. 이 위치부터 설정 읽어가므로 항상 프로젝트 최상단 위치 필수. (entrypoint)
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);     // 내장 WAS(Web Application Server) 실행
    }
}
