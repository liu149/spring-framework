package com.lq.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//@Service
public class A {
	@Autowired
	private B b;

	public void test(){
		System.out.println("AAAAAAAAAA");
		b.test();
	}
}
