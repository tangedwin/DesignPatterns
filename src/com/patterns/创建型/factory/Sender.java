package com.patterns.创建型.factory;

/**
 * 共同的发送接口
 */
public interface Sender {
	/**
	 * 接口方法，由不同的类实现
	 */
	public void Send();
}
