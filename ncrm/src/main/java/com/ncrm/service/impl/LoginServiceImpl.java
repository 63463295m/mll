package com.ncrm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ncrm.dao.LoginMapper;
import com.ncrm.entity.Login;
import com.ncrm.service.LoginService;

import java.util.List;

@Service(value = "loginService")
public class LoginServiceImpl implements LoginService{
	
	@Autowired
	private LoginMapper loginMapper;
	
	
	
	@Override
	public Login selectLoginById(Integer id) {
		return loginMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<Login> allLogin() {
		return loginMapper.allLogin();
	}

}
