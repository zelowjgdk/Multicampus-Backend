package org.galapagos.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.log;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/security")
@Log4j
public class SecurityController {
	@GetMapping("/all")
	public void doAll() {
		log.info("do all can access everybody");
	}
	  
	@GetMapping("/member")
	public void doMember() {
		log.info("logined member");
	}
	  
	@GetMapping("/admin")
	public void doAdmin() {
		log.info("admin only");
	}  
	
	@GetMapping("/login")
	public void login() {
		log.info("login page");
	}
	
	@GetMapping("/logout")
	public void logout() {
		log.info("logout page");
	}
	

	
}