package com.mycompany.myapp09.mamber.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.mycompany.myapp09.mamber.model.service.MemberService;

@Controller
public class MemberController {
	
	@Autowired
	private MemberService memberService;
	
	public String idCheck() {
		
	}

}
