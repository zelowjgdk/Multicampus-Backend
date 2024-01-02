package org.galapagos.domain;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.springframework.security.core.authority.SimpleGrantedAuthority;

import lombok.Data;


@Data
public class MemberVO {

	private String username;
	private String password;
	private String password2;
	private String email;
	private Date regDate;
	private Date updateDate;
	
	private List<AuthVO> authList;
	
	//회원 관련 정보를 저장하고 제공하는 데이터 클래스
	
	public Collection<SimpleGrantedAuthority> getAuthorities() { // 사용자의 권한 정보
		List<SimpleGrantedAuthority> authorities = new ArrayList<>();
		// <>를 저장할 목록(list) 생성 ->이 목록은 사용자의 권한 정보를 저장하기 위해 사용
		
		for(AuthVO auth:authList) { //AuthVO 객체를 하나씩 반복적으로 가져옴 authList=authVO
			authorities.add(new SimpleGrantedAuthority(auth.getAuth()));
			// authVO객체에서 getAuth 메서드를 호출 -> 권한정보를 추출 ->new의 생성자를 통해 
			//'simpl~'객체로 변환 -> 이 객체를 authorities 목록에 추가
		}
		return authorities; 
		//모든 authVO 객체에서 추출한 권한 정보를 담고 있는 'simpl~' 객체의 목록을 반환
	}
	// AuthVO 객체의 목록에서 권한 정보를 추출하여 'Simpl~' 객체의 컬렉션으로 변환하는 역할

	
	
}
