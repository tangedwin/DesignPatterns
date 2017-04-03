package com.patterns.行为型.类之间.observer;

import org.junit.Test;

public class ObserverTest {

	@Test
	public void 观察者模式(){
		Subject sub = new MySubject();  
        sub.add(new Observer1());  
        sub.add(new Observer2());  
        
        sub.operation(); 
	}
}
