package kr.hs.study.dao;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.hs.study.dto.cartDTO;

@Repository
public class cartDAOImpl implements cartDAO{
	
	@Autowired
	SqlSessionTemplate sqlseesion;

	public void insert(cartDTO dto) {
		sqlseesion.insert("product_mapper_xml.insert_cart",dto);
	}
	
	public List<Map<String, Object>> selectAll(){
		return sqlseesion.selectList("product_mapper_xml.select_cart");
	}

}
