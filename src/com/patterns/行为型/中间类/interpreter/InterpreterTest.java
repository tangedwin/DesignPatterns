package com.patterns.��Ϊ��.�м���.interpreter;

import org.junit.Test;

public class InterpreterTest {

	@Test
	public void ������ģʽ(){
		int result = new Minus().interpret((new Context(new Plus().interpret(new Context(9, 2)), 8)));
		System.out.println(result);
	}
}
