package org.galapagos.config;

import javax.sql.DataSource;

import org.galapagos.security.CustomUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.rememberme.JdbcTokenRepositoryImpl;
import org.springframework.security.web.authentication.rememberme.PersistentTokenRepository;

import lombok.extern.log4j.Log4j;

@Configuration
@EnableWebSecurity
@Log4j

public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	public void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().antMatchers("/security/all").permitAll().antMatchers("/security/admin")
				.access("hasRole('ROLE_ADMIN')").antMatchers("/security/member").access("hasRole('ROLE_MEMBER')");

		// 로그인 설정
		http.formLogin().loginPage("/security/login") // 로그인 페이지 경로
				.loginProcessingUrl("/security/login") // 제출버튼 누르면 검증
				.defaultSuccessUrl("/"); // 로그인 성공시 홈으로

		// 로그아웃 설정
		http.logout().logoutUrl("/security/logout") // POST: 로그아웃 호출 url
				.invalidateHttpSession(true) // 트루설정시 세션이 무효화되어 로그아웃 시 정보 삭제
				.deleteCookies("remember-me", "JSESSION-ID") // 로구아웃 시 삭제할 쿠키들
				// remember-me 쿠키는 사용자를 자동으로 로그인하는데 사용되는 경우가 많음
				// JSESSION-ID 세션관리를 위한 것
				.logoutSuccessUrl("/security/logout");

		// remember-me
		http.rememberMe().key("Galapagos").tokenRepository(persistentTokenRepository())
				.tokenValiditySeconds(7 * 24 * 60 * 60); // 7일

		http.formLogin();
	}

	@Autowired
	private DataSource dataSource;

	@Bean
	public PersistentTokenRepository persistentTokenRepository() {
		JdbcTokenRepositoryImpl repo = new JdbcTokenRepositoryImpl();
		repo.setDataSource(dataSource);

		return repo;
	}

	@Bean //customUserService 라는 빈을 정의
	public UserDetailsService customUserService() { // 사용자 정보를 로드하고 인증에 필요한 정보 제공
		return new CustomUserDetailsService(); //사용자 정보를 데이터베이스나 다른 데이터 소스에서 가져오는데 사용되는 
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		log.info("configure..............................");

		auth.inMemoryAuthentication().withUser("admin")
				.password("$2a$10$EsIMfxbJ6NuvwX7MDj4WqOYFzLU9U/lddCyn0nic5dFo3VfJYrXYC").roles("ADMIN");

		auth.inMemoryAuthentication().withUser("member")
				// .password("{noop}1234")
				.password("$2a$10$EsIMfxbJ6NuvwX7MDj4WqOYFzLU9U/lddCyn0nic5dFo3VfJYrXYC").roles("MEMBER");
	
		auth.userDetailsService(customUserService()) //사용자 인증 권한 설정을 구성
		.passwordEncoder(passwordEncoder()); //패스워드를 안전하게 저장하고 비교하기 위해
	}

	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
}
