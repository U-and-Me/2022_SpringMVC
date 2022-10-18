package kr.hs.study.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.hs.study.dao.cartDAO;
import kr.hs.study.dto.cartDTO;

@Service
public class cartServiceImpl implements cartService{
	
	@Autowired
	cartDAO dao;

	public void insert(cartDTO dto) {
		dao.insert(dto);
	}
	
	public List<Map<String, Object>> selectAll(){
		return dao.selectAll();
	}

}
