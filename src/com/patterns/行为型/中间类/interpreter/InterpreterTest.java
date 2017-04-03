package com.patterns.行为型.中间类.interpreter;

import org.junit.Test;

public class InterpreterTest {

	@Test
	public void 解释器模式(){
		int result = new Minus().interpret((new Context(new Plus().interpret(new Context(9, 2)), 8)));
		System.out.println(result);
	}
}
