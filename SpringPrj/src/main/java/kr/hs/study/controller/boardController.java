package kr.hs.study.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.hs.study.dto.boardDTO;
import kr.hs.study.service.boardService;

@Controller
public class boardController {
	@Autowired
	boardService boardservice;

	// °Ô½ÃÆÇ
	@GetMapping("/bbs")
	public String home() {
		return "board/index";
	}
		
	@GetMapping("/write_form")
	public String write_form() {
		return "board/write_form";
	}
	
	@PostMapping("/board_register")
	public String board_register(boardDTO dto) {
		boardservice.insert(dto);
		
		return "board/result";
	}
	
	@GetMapping("/show_form")
	public String show_form(Model model) {
		List<boardDTO> list = boardservice.selectAll();
		model.addAttribute("list", list);
		
		return "board/show_form";
	}

	@GetMapping("board/update")
	public String update(Model model, @RequestParam int idx) {
		boardDTO list = boardservice.read(idx);
		model.addAttribute("list", list);
		
		return "/board/update_form";
	}
	
	@PostMapping("board/update_form")
	public String update_form(boardDTO dto, @RequestParam int idx) {
		dto.setIdx(idx);
		boardservice.update(dto);
		System.out.println(dto.getIdx());
		System.out.println(dto.getContent());
		
		return "board/result";
	}
	
	@GetMapping("board/delete")
	public String delete(@RequestParam int idx) {
		boardservice.delete(idx);
		
		return "board/result";
	}
	
}