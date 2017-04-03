package com.patterns.行为型.父类子类.strategy;


/**
 * 该抽象类属于辅助类，提供辅助函数，并不是策略模式必须的
 */
public class AbstractStrategy {
	public void printName(String name){
		System.out.print(name + " ");
	}
}
