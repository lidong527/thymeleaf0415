package com.example.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("msg", "Hello! Thymleaf!!");
		return "index";
	}
	
}
