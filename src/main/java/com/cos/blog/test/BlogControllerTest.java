package com.cos.blog.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// 스프링 IOC 제어역전 빈등록 객체로 띄워줌 스프링에서 알아서
@RestController// 스프링이 com.cos.blog 패키지 이하를 스캔해서 모든 파일을 메모리에 new하는것은 아니고 특정 어노테이션이 붙어있는 클래스 파일들을 new해서(loc) 스프링 컨테이너에 관리해준다
public class BlogControllerTest {
 
	@GetMapping("/test/hello")
	public String hello() {
		return "<h1>hello springboot<h1>";
	}
	
}
