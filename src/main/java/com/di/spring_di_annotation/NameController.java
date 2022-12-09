package com.di.spring_di_annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NameController {
	
	//@Autowired
	//INameService firstNameService;
	private final INameService firstNameService;
	@Autowired
	public NameController(INameService firstNameService) {
		this.firstNameService=firstNameService;
	}

	@RequestMapping("/showName")
	public String showName() {
		firstNameService.showName("이몽룡");
		return "home";
	}

}
