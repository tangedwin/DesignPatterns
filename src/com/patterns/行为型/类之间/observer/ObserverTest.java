package com.patterns.��Ϊ��.��֮��.observer;

import org.junit.Test;

public class ObserverTest {

	@Test
	public void �۲���ģʽ(){
		Subject sub = new MySubject();  
        sub.add(new Observer1());  
        sub.add(new Observer2());  
        
        sub.operation(); 
	}
}
