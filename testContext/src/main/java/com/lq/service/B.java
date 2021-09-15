package com.lq.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//@Service
public class B {
	@Autowired
	private A a;

	public void test(){
		System.out.println("BBBBBBBBBB");
		a.test();
	}
}
