package com.patterns.������.factory;

/**
 * ���ŷ�����
 */
public class SmsSender implements Sender {
	/**
	 * ʵ�ַ��ͷ������Ͷ���
	 */
	@Override
	public void Send() {
		 System.out.println("this is sms sender!");
	}

}
