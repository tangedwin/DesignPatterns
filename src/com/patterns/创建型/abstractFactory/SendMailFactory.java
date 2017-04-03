package com.patterns.创建型.abstractFactory;

/**
 * 邮件发送类工厂
 */
public class SendMailFactory implements Provider {
	/**
	 * 创建邮件发送类实例
	 */
	@Override
	public Sender produce() {
        return new MailSender();  
	}

}
