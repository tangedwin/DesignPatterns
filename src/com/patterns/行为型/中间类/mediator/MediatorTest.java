package com.patterns.��Ϊ��.�м���.mediator;

import org.junit.Test;

public class MediatorTest {

	@Test
	public void �н���ģʽ(){
		Mediator mediator = new MyMediator();  
        mediator.createMediator();  
        mediator.workAll();
	}
}
