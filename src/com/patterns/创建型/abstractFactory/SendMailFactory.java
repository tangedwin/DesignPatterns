package com.patterns.������.abstractFactory;

/**
 * �ʼ������๤��
 */
public class SendMailFactory implements Provider {
	/**
	 * �����ʼ�������ʵ��
	 */
	@Override
	public Sender produce() {
        return new MailSender();  
	}

}
