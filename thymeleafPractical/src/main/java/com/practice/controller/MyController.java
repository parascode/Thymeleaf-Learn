package com.practice.controller;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController {

	@RequestMapping(path = "/about",method = RequestMethod.GET)
	public String about(Model model) {
		System.out.println("Inside about handler");
		model.addAttribute("name", "Paras Jain");
		model.addAttribute("date", new Date().toLocaleString());
		return "about";
		//about.html page to show
	}
	@GetMapping("/loop-example")
	public String iterate(Model m) {
		List<String> names = List.of("Naman", "Amit", "Sanskar", "Aman");
		m.addAttribute("names", names);
		return "iterate";
	}
	@GetMapping("/condition")
	public String condition(Model m) {
		System.out.println("Inside condition handler..");
		m.addAttribute("isActive", false);
		m.addAttribute("gender", "F");
		List<Integer> list = List.of(12, 45);
		m.addAttribute("mylist", list);
		return "condition";
	}
	@GetMapping("/service")
	public String serviceHandler(Model m) {
		m.addAttribute("title", "title from controller");
		m.addAttribute("subtitle", "subtitle from controller");
		return "service";
	}
	@GetMapping("/aboutnew")
	public String aboutnew() {
		return "aboutnew";
	}
	@GetMapping("/contact")
	public String contact() {
		return "contact";
	}
}
