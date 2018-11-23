package com.zwfu.fm;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ImportResource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@ImportResource(locations={"classpath:provider.xml"})
public class Application{
	public static void main(String[] args) throws Exception {
		System.setProperty("es.set.netty.runtime.available.processors", "false");
		SpringApplication.run(Application.class, args);
	}


}
