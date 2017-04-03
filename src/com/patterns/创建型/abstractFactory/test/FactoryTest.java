package com.patterns.创建型.abstractFactory.test;

import org.junit.Test;

import com.patterns.创建型.abstractFactory.Provider;
import com.patterns.创建型.abstractFactory.SendSmsFactory;
import com.patterns.创建型.abstractFactory.Sender;

public class FactoryTest {
	/**
	 * 抽象工厂测试
	 */
	@Test
	public void 抽象工厂() {
		Provider provider = new SendSmsFactory();  
        Sender sender = provider.produce();  
        sender.Send();  
	}
}
