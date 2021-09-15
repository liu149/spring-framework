package com.lq.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;


@Service
public class UserService extends IUserService{

	@Override
	public void hello(){
		System.out.println("hello 22222222");
	}




}
