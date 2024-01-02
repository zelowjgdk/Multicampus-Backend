package org.galapagos.controller;

import java.util.LinkedHashMap;
import java.util.Map;

import javax.validation.Valid;

import org.galapagos.domain.MemberVO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j;

//@Controller
@Log4j
@RequestMapping("/test")
public class TestController2 {

	private int[] years = {2000, 2001, 2002, 2003 };
	private String[] hobbies = { "야구", "축구", "배구" };

	public Map<String, String> getRoles() {
		Map<String, String> map = new LinkedHashMap<>();
		map.put("ROLE_ADMIN", "Admin");
		map.put("ROLE_MANAGER", "관리자");
		map.put("ROLE_MEMBER", "일반회원");

		return map;
	}

	public Map<String, String> getHobbies() {
		Map<String, String> hobbies = new LinkedHashMap<>();
		hobbies.put("BASEBALL", "야구");
		hobbies.put("FOOTBALL", "축구");
		hobbies.put("VOLLYBALL", "배구");

		return hobbies;
	}

	private String[] genders = { "남자", "여자" };

	@GetMapping("/join")
	public void join(
		@ModelAttribute("member") MemberVO member,
		Model model) {
		model.addAttribute("years", years);		
		model.addAttribute("roles", getRoles());
		model.addAttribute("hobbies", getHobbies());
		model.addAttribute("genders", genders);
	}

	
	
	@PostMapping("/join")
	public String join(
			@Valid @ModelAttribute("member") MemberVO member, 
			Errors errors, Model model) {

		if(!member.getPassword().equals(member.getPassword2())) {
			errors.rejectValue("password2", "비밀번호확인 에러", "비밀번호 확인이 일치하지 않습니다.");
			
		}

		
		if(errors.hasErrors()) {
			model.addAttribute("years", years);
			model.addAttribute("roles", getRoles());
			model.addAttribute("hobbies", getHobbies());		
			model.addAttribute("genders", genders);

			return "test/join";
			
		}
		
		
		
		return "redirect:/";
	}
	
}
