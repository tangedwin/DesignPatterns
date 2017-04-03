package com.patterns.结构型.flyweight;

import org.junit.Test;

public class FlyweightTest {
	
	@Test
	public void 享元模式(){
		FlyweightFactory factory = new FlyweightFactory(); 
		Flyweight fly1,fly2,fly3,fly4,fly5,fly6;
		fly1 = factory.getFlyWeight("Flyweight1");
		fly2 = factory.getFlyWeight("Flyweight2");
		fly3 = factory.getFlyWeight("Flyweight1");
		fly4 = factory.getFlyWeight("Flyweight1");
		fly5 = factory.getFlyWeight("Flyweight1");
		fly6 = factory.getFlyWeight("Flyweight1");
		
		fly1.operation();
		fly2.operation();
		fly3.operation();
		fly4.operation();
		fly5.operation();
		fly6.operation();
		System.out.println("objSize = " + factory.getFlyweightSize()); 
	}
}
