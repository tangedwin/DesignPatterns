package com.patterns.行为型.父类子类.templateMethod;

public class Plus extends AbstractCalculator {

	@Override
	public int calculate(int num1, int num2) {
		return num1 + num2;
	}

}
