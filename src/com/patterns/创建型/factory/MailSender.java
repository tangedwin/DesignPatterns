package com.patterns.������.factory;

/**
 * �ʼ�������
 */
public class MailSender implements Sender {
	/**
	 * ʵ�ַ��ͷ��������ʼ�
	 */
	@Override
	public void Send() {
		System.out.println("this is mailsender!");
	}

}
