package com.blueice.springbootwebdev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@RequestMapping("/index")
	public String index(Model model){
		Person single = new Person("gaoyanbin",100);
		List<Person> people = new ArrayList<Person>();
		Person p1 = new Person("xx",200);
		Person p2 = new Person("yy",300);
		Person p3 = new Person("zz",400);
		people.add(p1);
		people.add(p2);
		people.add(p3);
		model.addAttribute("singlePerson",single);
		model.addAttribute("people",people);
		return "index";
	}

}
