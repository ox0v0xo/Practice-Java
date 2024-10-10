package com.iw.project_blog;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.iw.project_blog.mapper")
public class ProjectBlogApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectBlogApplication.class, args);
	}

}
