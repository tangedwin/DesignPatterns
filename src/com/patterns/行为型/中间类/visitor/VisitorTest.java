package com.patterns.行为型.中间类.visitor;

import org.junit.Test;

public class VisitorTest {

	@Test
	public void 访问者模式(){
		Visitor visitor = new MyVisitor();  
        Subject sub = new MySubject();  
        sub.accept(visitor);
	}
}
