package org.galapagos.mapper;

import org.apache.ibatis.annotations.Select;
import org.galapagos.domain.AuthVO;
import org.galapagos.domain.MemberVO;

public interface MemberMapper {
	public MemberVO read(String username);
	
	public void insert(MemberVO member);
	
	public void insertAuth(AuthVO auth);
}

//이 인터페이스를 구현한 클래스는 이러한 데이터베이스 작업을 실제로 처리
//mybatis와 함께 사용하여 데이터 베이스에 대한 쿼리와 상호작용 수행