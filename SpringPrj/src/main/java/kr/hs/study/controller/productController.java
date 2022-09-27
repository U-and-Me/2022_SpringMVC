package kr.hs.study.controller;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import kr.hs.study.dto.productDTO;
import kr.hs.study.service.productService;

@Controller
public class productController {
	
	@Autowired
	productService productservice;
	
	@GetMapping("/shop")
	public String shop() {
		
		return "product/list";
	}
	
	@GetMapping("/product/add")
	public String add() {
		return "product/add_form";
	}
	
	@PostMapping("/product/insert_product")
	public String insert_product(productDTO dto) {
		String filename = dto.getProductImage().getOriginalFilename();
		String path = "C:\\_springMVC\\SpringPrj\\images\\";
		
		try {
			new File(path).mkdirs();	// ���丮 ����
			// �ӽ� ���丮�� ����� ������ ������ ���丮�� ����
			dto.getProductImage().transferTo(new File(path+filename));
		}catch(Exception e) {
			System.out.println(e);
		}
		
		dto.setProductUrl(filename);
		productservice.insert(dto);
		
		return "redirect:/";
	}
}