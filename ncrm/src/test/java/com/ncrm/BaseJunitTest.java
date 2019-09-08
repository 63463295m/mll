package com.ncrm;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//表示继承了SpringJUnit4ClassRunner类
@RunWith(SpringJUnit4ClassRunner.class)     
@ContextConfiguration(locations = {"classpath*:spring.xml","classpath*:spring-mybatis.xml","classpath*:spring-mvc.xml"})
public class BaseJunitTest {

	
}
