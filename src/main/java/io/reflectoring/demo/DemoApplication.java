package io.reflectoring.demo;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		// 通过类名获取bean
		ApplicationContext context = new AnnotationConfigApplicationContext(DemoApplication.class);



		SpringApplication.run(DemoApplication.class, args);
	}

}
