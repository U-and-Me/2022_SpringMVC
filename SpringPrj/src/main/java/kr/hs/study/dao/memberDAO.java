package kr.hs.study.dao;

import java.util.List;

import kr.hs.study.dto.memberDTO;

public interface memberDAO {
	public void insert(memberDTO dto);
	public void update(memberDTO dto);
	public void delete(String userid);
	public List<memberDTO> select();
	public memberDTO read(String userid);
}
