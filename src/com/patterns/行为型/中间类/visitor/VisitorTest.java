package com.patterns.��Ϊ��.�м���.visitor;

import org.junit.Test;

public class VisitorTest {

	@Test
	public void ������ģʽ(){
		Visitor visitor = new MyVisitor();  
        Subject sub = new MySubject();  
        sub.accept(visitor);
	}
}
