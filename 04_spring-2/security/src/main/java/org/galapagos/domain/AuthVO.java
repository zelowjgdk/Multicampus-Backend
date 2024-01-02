package org.galapagos.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AuthVO {

	private String username;
	private String auth;
}

//사용자 인증 정보나 권한 정보를 표현하고 저장하는 유용