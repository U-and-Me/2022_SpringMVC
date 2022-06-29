package kr.hs.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;


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
	@GetMapping(value="/multi_table")
	public String multi_table() {
		
				
		
		
		return "result";
	}
}
