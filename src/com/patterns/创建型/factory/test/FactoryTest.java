package com.patterns.创建型.factory.test;

import org.junit.Test;

import com.patterns.创建型.factory.Sender;

public class FactoryTest {
	/**
	 * 普通工厂方法测试
	 */
	@Test
	public void 普通工厂方法() {
		com.patterns.创建型.factory.普通工厂方法.SendFactory factory = new com.patterns.创建型.factory.普通工厂方法.SendFactory();  
		Sender sender = factory.produce("sms");  
        sender.Send();
	}
	/**
	 * 多个工厂方法测试
	 */
	@Test
	public void 多个工厂方法() {
		com.patterns.创建型.factory.多个工厂方法.SendFactory factory = new com.patterns.创建型.factory.多个工厂方法.SendFactory();  
		Sender sender = factory.produceSms();
        sender.Send();
	}
	/**
	 * 静态工厂方法测试
	 */
	@Test
	public void 静态工厂方法() {
		Sender sender = com.patterns.创建型.factory.静态工厂方法.SendFactory.produceSms();
        sender.Send();
	}

}
