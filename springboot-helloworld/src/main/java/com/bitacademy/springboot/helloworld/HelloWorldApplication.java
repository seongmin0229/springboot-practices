package com.bitacademy.springboot.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/*
 * 1. 스프링 어플리케이션 부트스트래핑 역할: Bootstrap Class
 * 2. 설정 클래스 역할: Configuration Class
 */

@SpringBootApplication
public class HelloWorldApplication {

	public static void main(String[] args) {
		/*
		 * SpringApplication.run(...) 안에서 일어나는 일(Bootstrap)
		 * 
		 * 1. 어플리케이션 컨텍스트(Application Context, Spring Container) 생성
		 * 2. 만약, 웹 어플리케이션이라면 웹 어플리케이션의 타입(Spring MVC, Reactive)결정
		 * 3. 어노테이션 스캐닝(Auto) +  Configuration Class를 통한
		 *    빈 생성/등록/DI 작업
		 * 4. 만약, Spring MVC 이라면 
		 *    1. Auto Configuration
		 *    2. 내장(embed) 서버(TomcatEmbededServiceServletContainer) 인스턴스 생성
		 *    3. 서버 인스턴스에 웹 어플리케이션 배포
		 *    4. 서버 인스턴스 실행
		 * 5. ApplicationRunner 인터페이스를 구현한 빈을 ApplicationContext에서 찾아 실행
		 */
//		ConfigurableApplicationContext ac = null;
//		try {
//			ac = SpringApplication.run(HelloWorldApplication.class, args);			
//		}catch(Exception e) {
//			e.printStackTrace();
//		}finally {
//			if(ac != null) {
//				ac.close();				
//			}
//		}
		
		// try ~ with ~ resource
		try(ConfigurableApplicationContext ac = SpringApplication.run(HelloWorldApplication.class, args)){}
	}

}
