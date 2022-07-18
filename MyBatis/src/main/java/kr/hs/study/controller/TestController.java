package kr.hs.study.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import kr.hs.study.model.DataBean;
import kr.hs.study.service.serviceInterface;

@Controller
public class TestController {

	@Autowired
	private serviceInterface service;
	
	@GetMapping(value="input_data")
	public String input() {
		return "input";
	}
	
	@PostMapping(value="re_input")
	public String re_input(@ModelAttribute DataBean bean) {
		service.insert(bean);
		
		return "result";
	}
	
	@GetMapping(value="read_data")
	public String read(Model model) {
		List<DataBean> list = service.select();
		
		model.addAttribute("list", list);
		
		return "result2";
	}
	
	@GetMapping(value="update_data")
	public String update() {
		return "update";
	}
	
	@PostMapping(value="re_update")
	public String re_update(DataBean bean) {
		service.update(bean);
		
		return "result";
	}
	
}
