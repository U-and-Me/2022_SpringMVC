package kr.hs.study.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.hs.study.dto.memberDTO;

@Repository
public class memberDAOImpl implements memberDAO {

	@Autowired
	private SqlSessionTemplate sqlSession;
	
	public void insert(memberDTO dto) {
		sqlSession.insert("member.insert_data", dto);
	}

	public void update(memberDTO dto) {
		// TODO Auto-generated method stub
		sqlSession.update("member.update_data", dto);
	}

	public void delete(String userid) {
		// TODO Auto-generated method stub
		sqlSession.delete("member.delete_data", userid);
	}

	public List<memberDTO> select() {
		return sqlSession.selectList("member.select_data");
		
	}

	public memberDTO read(String userid) {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("member.read", userid);
	}

}
