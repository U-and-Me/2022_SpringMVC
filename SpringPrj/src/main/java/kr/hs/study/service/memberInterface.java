package kr.hs.study.service;

import java.util.List;

import kr.hs.study.dto.memberDTO;

public interface memberInterface {
	//��� ����, ����, ����, �������� �޼��� �ۼ�
	public void insert(memberDTO dto);
	public void update(memberDTO dto);
	public void delete(String userid);
	public List<memberDTO> select();
	public memberDTO read(String userid);
}
