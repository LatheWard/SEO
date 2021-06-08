package com.example.SEO;

import com.example.SEO.User.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class SeoApplication {
	public static void main(String[] args) {
		SpringApplication.run(SeoApplication.class, args);
	}
}
