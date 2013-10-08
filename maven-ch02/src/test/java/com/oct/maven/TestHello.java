package com.oct.maven;

import org.junit.*;
import static org.junit.Assert.*;

public class TestHello
{
	@Test
	public void testSayHello(){
		HelloMaven2 hm = new HelloMaven2();
		String str = hm.say("maven");
		assertEquals(str,"hello,maven");
	}
	
}