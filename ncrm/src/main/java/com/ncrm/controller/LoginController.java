package com.ncrm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ncrm.entity.Login;
import com.ncrm.service.LoginService;


@Controller
@RequestMapping(value="/loginController")
public class LoginController {
	
/*
 *	Local -dev_3 - 1
 *	eclipse - 1
 *  
 */

	@Autowired
	private LoginService loginService;


	@RequestMapping("/index")
	public String index(Model m){
		
		Login login = loginService.selectLoginById(1);
		
		m.addAttribute("login", login);
		return "index";
	}

	@RequestMapping("/allLogin")
	@ResponseBody
	public Object get1(Model m){
		System.out.printf("11111");

		return loginService.allLogin();
	}
	
}











