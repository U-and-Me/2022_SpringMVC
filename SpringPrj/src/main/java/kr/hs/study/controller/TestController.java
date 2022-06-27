package kr.hs.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class TestController {
	
	// 1���� 10������ ��
	@RequestMapping(value="/sum", method=RequestMethod.GET)
	public String sum() {
		int sum = 0;
		for(int i = 1; i <= 10; i++)
			sum += i;
		System.out.println("1���� 10������ �� : " + sum);
		
		return "result";
	}
	
	@RequestMapping(value="/multi_table", method=RequestMethod.GET)
	public String multi_table() {
		
				
		
		
		return "result";
	}
}
