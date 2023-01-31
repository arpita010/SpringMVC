package com.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ORM.EmployeeDao;
import com.entity.Employee;

@Controller
public class MainController {
	@RequestMapping("/form")
	public String getFormPage()
	{
		return "form";
	}
	@RequestMapping(path="/processForm",method=RequestMethod.POST)
	public String handleForm(@ModelAttribute Employee employee,Model model)
	{
		System.out.println(employee);
		ApplicationContext con=new ClassPathXmlApplicationContext("com/ORM/config.xml");
		EmployeeDao dao=con.getBean("employeeDao",EmployeeDao.class);
		int rows=dao.insert(employee);
		System.out.println(rows+" record inserted !!!");
		return "success";
	}
	
}
