package com.springboot.demo;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.nio.charset.Charset;

@SpringBootApplication
@Controller
@Configuration
public class DemoApplication {
	@RequestMapping("hello")
	@ResponseBody
	public String hello(){
		return "hello world 果子!";
	}

//	@Bean
//	public StringHttpMessageConverter stringHttpMessageConverter() {
//		StringHttpMessageConverter converter = new StringHttpMessageConverter(Charset.forName("ISO-8859-1"));
//		return converter;
//	}

	public static void main(String[] args) {

		//SpringApplication.run(DemoApplication.class, args);
		SpringApplication application = new SpringApplication(DemoApplication.class);
		application.setBannerMode(Banner.Mode.OFF);
		application.run(args);
	}
}
