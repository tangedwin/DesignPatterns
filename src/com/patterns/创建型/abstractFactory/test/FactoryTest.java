package com.patterns.������.abstractFactory.test;

import org.junit.Test;

import com.patterns.������.abstractFactory.Provider;
import com.patterns.������.abstractFactory.SendSmsFactory;
import com.patterns.������.abstractFactory.Sender;

public class FactoryTest {
	/**
	 * ���󹤳�����
	 */
	@Test
	public void ���󹤳�() {
		Provider provider = new SendSmsFactory();  
        Sender sender = provider.produce();  
        sender.Send();  
	}
}
