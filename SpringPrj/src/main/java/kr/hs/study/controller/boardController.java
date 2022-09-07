package kr.hs.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class boardController {

	// °Ô½ÃÆÇ
	@GetMapping("/bbs")
	public String home() {
		return "board/index";
	}
		
	@GetMapping("/write_form")
	public String write_form() {
		return "board/write_form";
	}
	
}
