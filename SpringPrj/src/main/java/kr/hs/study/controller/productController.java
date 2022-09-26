package kr.hs.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class productController {
	
	@GetMapping("/shop")
	public String shop() {
		
		return "product/list";
	}
	
	@GetMapping("/product/add")
	public String add() {
		return "product/add_form";
	}
	
	@PostMapping("/product/add_form")
	public String add_form() {
		
		
		
		 return "result";
	}
}
