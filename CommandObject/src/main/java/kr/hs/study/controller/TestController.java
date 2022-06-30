package kr.hs.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import kr.hs.study.dto.DataBean;

@Controller
public class TestController {

	/*
	// @ModelAttribute => 생략 가능
	@PostMapping(value="/test1")
	public String test1(@ModelAttribute DataBean bean, Model model) {
		
		model.addAttribute("data1", bean.getData1());
		model.addAttribute("data2", bean.getData2());
		
		
		return "test1";
	}
*/
	
/*
	@PostMapping(value="/test1")
	public String test1(@ModelAttribute("data1") String data1, @ModelAttribute("data2") String data2, Model model) {
		
		model.addAttribute("data1", data1);
		model.addAttribute("data2", data2);
		
		return "test1";
	}
*/
	
	@PostMapping(value="/test1")
	public String test1(DataBean bean, Model model) {
		
		model.addAttribute("dto", bean);
		
		return "test1";
	}
	
}
