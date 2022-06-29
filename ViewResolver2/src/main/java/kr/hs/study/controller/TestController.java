package kr.hs.study.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {

	@GetMapping(value="/test1")
	public String test1() {
		return "test1";
	}
	
	@GetMapping(value="/test2")
	public String test2(HttpServletRequest request) {
		request.setAttribute("data3", 1);
		request.setAttribute("data4", 2);
		
		return "test2";
	}
	
	@GetMapping(value="/test3")
	// 데이터를 model에 넣음 => 실질적으로 request 영역에 저장한다는 의미
	public String test3(Model model) {
		model.addAttribute("data5", 500);
		model.addAttribute("data6", 600);
		
		return "test3";
	}
	
	@GetMapping(value="/test4")
	public ModelAndView test4(ModelAndView mv) {
		mv.setViewName("test4");
		mv.addObject("data7", 700);
		mv.addObject("data8", 800);
		
		return mv;
	}
	
}
