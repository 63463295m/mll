package com.ncrm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.annotation.BussinessLog;
import com.ncrm.entity.Login;
import com.ncrm.service.LoginService;


@Controller
@RequestMapping(value="/loginController")
public class LoginController {
	
/*
 *	
 *
 *	local - master - login - 4
 *  
 */

	@Autowired
	private LoginService loginService;

	@BussinessLog
	@RequestMapping("/index")
	public String index(Model m){
		
		Login login = loginService.selectLoginById(1);
		String str = "abc...";
		m.addAttribute("login", login).addAttribute("str", str);
		return "index";
	}

	@BussinessLog(value = "LoginController.get1()")
	@RequestMapping("/allLogin")
	@ResponseBody
	public Object get1(Model m){

		return loginService.allLogin();
	}
	
}











