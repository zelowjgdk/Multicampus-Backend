package org.galapagos.security.domain;

import org.galapagos.domain.MemberVO;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import lombok.Getter;

import java.util.Collection;

@Getter
public class CustomUser extends User { //사용자 정보와 관련된 추가적인 정보 저장

	private MemberVO member;

	public CustomUser(String username, String password, 
			Collection<? extends GrantedAuthority> authorities) {
		//사용자 정보를 받아들이는 생성자
		//이름,패스워드,권한정보를 받아들이고 user 클래스의 생성자를 호출하여 기본사용자 정보 초기화
		
		super(username, password, authorities);
	}

	public CustomUser (MemberVO vo) { //memberVO 객체를 받아들이는 생성자
		
		super(vo.getUsername(), vo.getPassword(), vo.getAuthorities());
		//부모 클래스인 'User'를 호출하고 동시에 'member'필드를 설정하여 사용자의 추가정보를 저장
		this.member = vo;
	}
}
