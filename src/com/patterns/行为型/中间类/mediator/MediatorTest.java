package com.patterns.行为型.中间类.mediator;

import org.junit.Test;

public class MediatorTest {

	@Test
	public void 中介者模式(){
		Mediator mediator = new MyMediator();  
        mediator.createMediator();  
        mediator.workAll();
	}
}
