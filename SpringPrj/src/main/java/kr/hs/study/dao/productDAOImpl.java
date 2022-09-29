package kr.hs.study.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.hs.study.dto.productDTO;

@Repository
public class productDAOImpl implements productDAO{
	
	@Autowired
	private SqlSessionTemplate sqlsession;

	public void insert(productDTO dto) {
		sqlsession.insert("product_mapper_xml.insert_product", dto);
	}

	public List<productDTO> selectAll() {
		return sqlsession.selectList("product_mapper_xml.selectall_product");
	}

	public void update(productDTO dto) {
		
	}

	public productDTO read(int id) {
		return null;
	}

	public void delete(int id) {
		
	}

}
