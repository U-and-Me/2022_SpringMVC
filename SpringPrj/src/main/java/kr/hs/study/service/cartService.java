package kr.hs.study.service;

import java.util.List;
import java.util.Map;

import kr.hs.study.dto.cartDTO;

public interface cartService {
	public void insert(cartDTO dto);
	public List<Map<String, Object>> selectAll();
}
