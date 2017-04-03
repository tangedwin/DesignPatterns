package com.patterns.创建型.abstractFactory;

/**
 * 短信发送类工厂
 */
public class SendSmsFactory implements Provider {
	/**
	 * 创建短信发送类实例
	 */
    @Override  
    public Sender produce() {  
        return new SmsSender();  
    }  
}  
