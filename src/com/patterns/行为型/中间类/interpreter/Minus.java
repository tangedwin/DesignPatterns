package com.patterns.��Ϊ��.�м���.interpreter;

public class Minus implements Expression {

	@Override
	public int interpret(Context context) {
		return context.getNum1()-context.getNum2();
	}

}
