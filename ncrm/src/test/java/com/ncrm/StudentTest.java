package com.ncrm;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.ncrm.dao.StudentMapper;
import com.ncrm.entity.Student;

public class StudentTest extends BaseJunitTest{


	@Autowired
	private StudentMapper studentMapper;
	
	/**
	 * 
	 */
	@Test
	public void test1(){
		List<Student> stuList = studentMapper.allStu();
		int size = stuList.size();
		System.out.println("size ->" + size);
		
	}
	
}

