package com.cts.abcd.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("gnp1")
//@Primary
public class GreetNoteProviderSimpleImpl implements GreetNoteProvider {

	public String getGreetNote() {
		// TODO Auto-generated method stub
		return "Hello welcome ";
	}

	public GreetNoteProviderSimpleImpl() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
