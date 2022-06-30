package kr.hs.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import kr.hs.study.dto.ScoreBean;


@Controller
public class TestController {
	
	// 1부터 10까지의 합
	@GetMapping(value="sum")
	public ModelAndView sum(ModelAndView mv) {
		int sum = 0;
		for(int i = 1; i <= 10; i++)
			sum += i;
		System.out.println("1부터 10까지의 합 : " + sum);
		
		mv.setViewName("sum");
		mv.addObject("total", sum);
		
		return mv;
	}
	
	// 구구단
	@GetMapping(value="/multi_table/{d}")
	public String multi_table(@PathVariable int d, Model model) {
		
		String multi_table = "";
		
		for(int i = 1; i < 10; i++) {
			multi_table += d + " * " + i + " = " + (d*i) + "<br>";
		}
		
		model.addAttribute("result", multi_table);
		
		return "multi_table";
	}
	
	@GetMapping(value="/score")
	public String score() {
		return "score";
	}
	
	// 성적
	@PostMapping(value="/score")
	public String score(ScoreBean bean, Model model){
		
		model.addAttribute("dto", bean);
		
		
		return "re_score";
	}
}
