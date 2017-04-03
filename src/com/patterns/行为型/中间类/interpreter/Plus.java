package com.patterns.行为型.中间类.interpreter;

public class Plus implements Expression {

	@Override
	public int interpret(Context context) {
		return context.getNum1()+context.getNum2();
	}

}
