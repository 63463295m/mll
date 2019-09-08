package com.ncrm.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ncrm.dao.StudentMapper;
import com.ncrm.entity.Student;


@Controller
@RequestMapping("/user")
public class UserCtrl {

	@Autowired
	private StudentMapper stuDao;
   
	@RequestMapping(value = "",method=RequestMethod.GET)
	public String getAllStu(Model m) {
		
		List<Student> stuList = stuDao.allStu();
		List pageList = null;
		int pages = 3;
		for (int i = 0; i < stuList.size(); i++) {
			int flag = 0;
			pageList = new ArrayList<>();
			
		}
		
		
		m.addAttribute("stuList", stuList);
		return "login";
	}
	
	
     
     
     
}
