package kr.hs.study.dao;

import java.util.List;
import java.util.Map;

import kr.hs.study.dto.cartDTO;

public interface cartDAO {
	public void insert(cartDTO dto);
	public List<Map<String, Object>> selectAll();
}
