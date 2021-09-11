package net.codejava.main;

import net.codejava.student.StudentController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.io.File;

@SpringBootApplication
@RestController
public class DemoApplication {
	public static final String CONTENT_FOLDER = "/web-content";

	public static void main(String[] args) {
		//SpringApplication.run(DemoApplication.class, args);
		SpringApplication.run(StudentController.class, args);
		File f = new File("");
	}

	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hello %s!", name);
	}
	@GetMapping("/")
	public ModelAndView homePage() {
		ModelAndView mav = new ModelAndView(CONTENT_FOLDER+"/index.jsp");
		return mav;
	}
}