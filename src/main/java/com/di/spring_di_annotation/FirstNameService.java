package com.di.spring_di_annotation;

import org.springframework.stereotype.Service;

@Service
public class FirstNameService implements INameService {

	@Override
	public void showName(String name) {
		String myName = "내 이름은 " + name + "입니다";
		System.out.println("FirstNameService의 showName() 메소드");
		System.out.println(myName);

	}

}
