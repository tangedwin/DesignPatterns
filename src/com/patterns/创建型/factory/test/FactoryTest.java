package com.patterns.������.factory.test;

import org.junit.Test;

import com.patterns.������.factory.Sender;

public class FactoryTest {
	/**
	 * ��ͨ������������
	 */
	@Test
	public void ��ͨ��������() {
		com.patterns.������.factory.��ͨ��������.SendFactory factory = new com.patterns.������.factory.��ͨ��������.SendFactory();  
		Sender sender = factory.produce("sms");  
        sender.Send();
	}
	/**
	 * ���������������
	 */
	@Test
	public void �����������() {
		com.patterns.������.factory.�����������.SendFactory factory = new com.patterns.������.factory.�����������.SendFactory();  
		Sender sender = factory.produceSms();
        sender.Send();
	}
	/**
	 * ��̬������������
	 */
	@Test
	public void ��̬��������() {
		Sender sender = com.patterns.������.factory.��̬��������.SendFactory.produceSms();
        sender.Send();
	}

}
