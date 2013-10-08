package com.oct.maven;

import com.oct.maven.HelloMaven;

public class HelloMaven2
{
	
	public String say(String name){
		HelloMaven hm = new HelloMaven();
		return hm.sayHello(name);
	}
	
}