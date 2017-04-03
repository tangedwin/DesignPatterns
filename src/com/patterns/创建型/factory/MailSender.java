package com.patterns.创建型.factory;

/**
 * 邮件发送类
 */
public class MailSender implements Sender {
	/**
	 * 实现发送方法发送邮件
	 */
	@Override
	public void Send() {
		System.out.println("this is mailsender!");
	}

}
