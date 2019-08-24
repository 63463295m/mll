package com.ncrm.service;

import com.ncrm.entity.Login;

import java.util.List;

public interface LoginService {

	
	Login selectLoginById(Integer id);

	List<Login> allLogin();
}
