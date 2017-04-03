package com.patterns.结构型.decorator;

import org.junit.Test;

public class DecoratorTest {
	
	@Test
	public void 装饰器(){
		Sourceable source = new Source();  
        Sourceable obj = new Decorator(source);  
        obj.method();   
	}
}
