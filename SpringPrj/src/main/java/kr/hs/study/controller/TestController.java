package kr.hs.study.controller;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.hs.study.dto.DataBean;
import kr.hs.study.dto.memberDTO;
import kr.hs.study.service.memberInterface;

@Controller
public class TestController {
	@Autowired
	private memberInterface memberService;
	
	@GetMapping("/sum")
	public String sum(Model model) {
		int result = 0;
		for(int i=1; i<=10; i++) {
			result += i;
		}
		model.addAttribute("sum", result);
		return "member/sum";
	}
	
	@GetMapping("/multi_table")
	public String multiTable() {
		return "member/multi_table";
	}
	
	@GetMapping("/multi")
	public String multi(@RequestParam int number) {
		for(int i=1; i<=9; i++) {
			System.out.println(i + " * " + number + " = " + (i*number));
		}
		return "member/result";
	}
	
	@GetMapping("/grade")
	public String grade() {
		return "member/grade";
	}
	
	@GetMapping("/report")
	public String report(Model model, DataBean bean) {
		bean.setGrsum(bean.getKor()+bean.getEng()+bean.getMath());
		bean.setGravg((bean.getKor()+bean.getEng()+bean.getMath())/3);
		
		model.addAttribute("dto", bean);
		return "member/report";
	}
	
	@GetMapping("/register")
	public String login_form() {
		return "member/login_form";
		
	}
	
	@PostMapping("/register")
	public String register(memberDTO dto) {
		memberService.insert(dto);
		return "member/result";
	}
	
	@GetMapping("/select")
	public String select(Model model) {
		List<memberDTO> list = memberService.select();
		model.addAttribute("list", list);
		return "member/select";
	}
	
	@GetMapping("member/update")
	public String update(Model model, @RequestParam String userid) {
		memberDTO list = memberService.read(userid);
		model.addAttribute("list", list);
		
		return "/member/update_form";
	}
	
	@PostMapping("member/update_form")
	public String update_form(memberDTO dto) {
		memberService.update(dto);
		
		return "/member/result";
	}
}
