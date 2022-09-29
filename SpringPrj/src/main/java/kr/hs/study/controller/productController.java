package kr.hs.study.controller;

import java.io.File;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
			new File(path).mkdirs();	// 디렉토리 생성
			// 임시 디렉토리에 저장된 파일을 지정된 디렉토리로 전송
			dto.getProductImage().transferTo(new File(path+filename));
		}catch(Exception e) {
			System.out.println(e);
		}
		
		dto.setProductUrl(filename);
		productservice.insert(dto);
		
		return "redirect:/";
	}
	
	@GetMapping("/product/list")
	public String list(Model model) {
		List<productDTO> list = productservice.selectAll();
		model.addAttribute("list", list);
		
		return "product/product_list";
	}
	
	@GetMapping("product/detail/{productId}")
	public String detail(@PathVariable int productId, Model model) {
		productDTO list = productservice.read(productId);
		model.addAttribute("list", list);
		
		return "product/product_detail";
	}
}
