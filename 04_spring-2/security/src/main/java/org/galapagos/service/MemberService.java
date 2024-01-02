package org.galapagos.service;

import java.io.IOException;

import org.galapagos.domain.MemberVO;
import org.springframework.web.multipart.MultipartFile;

public interface MemberService {
	public MemberVO get(String username);
	//해당하는 회원정보를 조회하는 메서드
	
	public void register(MemberVO member, MultipartFile avatar) throws  IOException;

	//회원 서비스에 필요한 회원 정보 조회 및 등록과 관련된 기능을 정의
}
