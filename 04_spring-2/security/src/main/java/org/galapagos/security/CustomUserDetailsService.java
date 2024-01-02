package org.galapagos.security;

import org.galapagos.domain.MemberVO;
import org.galapagos.mapper.MemberMapper;
import org.galapagos.security.domain.CustomUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import lombok.Getter;
import lombok.extern.log4j.Log4j;
import oracle.jdbc.proxy._Proxy_;

@Log4j
public class CustomUserDetailsService implements UserDetailsService {
	//이 인터페이스는 사용자 정보를 로드하고 인증하는 메서드를 정의하며 사용자 정보 제공을 역할

	@Autowired
	private MemberMapper mapper;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		//'username'을 받아와 사용자의 정보를 로드하고 'userdetails'객체를 반환
		
		log.warn("Load User By Username: " + username);
        //먼저 로깅을 통해 사용자 이름을 기록
		
		MemberVO vo = mapper.read(username);
        //'memberMapper'를 사용하여 데이터베이스에서 해당 사용자 이름에 해당하는 'memberVO' 객체 'vo' 검색
		
		if (vo == null) {
			throw new UsernameNotFoundException(username);
		} // 만약 null인 경우 사용자를 찾을 수 없다는 예외
		
		log.warn("user vo: " + vo);

		return new CustomUser(vo);
	}
}
