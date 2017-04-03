package com.patterns.行为型.类之间.chainOfResponsibility;

import org.junit.Test;

public class ChainOfResponsibilityTest {

	@Test
	public void 责任链模式(){
		MyHandler h1 = new MyHandler("h1");  
        MyHandler h2 = new MyHandler("h2");  
        MyHandler h3 = new MyHandler("h3");  
  
        h1.setHandler(h2);  
        h2.setHandler(h3);  
  
        h1.operator(); 
	}
}
