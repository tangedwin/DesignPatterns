package com.patterns.�ṹ��.decorator;

import org.junit.Test;

public class DecoratorTest {
	
	@Test
	public void װ����(){
		Sourceable source = new Source();  
        Sourceable obj = new Decorator(source);  
        obj.method();   
	}
}
