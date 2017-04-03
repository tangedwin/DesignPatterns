package com.patterns.创建型.factory;

/**
 * 短信发送类
 */
public class SmsSender implements Sender {
	/**
	 * 实现发送方法发送短信
	 */
	@Override
	public void Send() {
		 System.out.println("this is sms sender!");
	}

}
