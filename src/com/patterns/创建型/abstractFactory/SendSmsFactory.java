package com.patterns.������.abstractFactory;

/**
 * ���ŷ����๤��
 */
public class SendSmsFactory implements Provider {
	/**
	 * �������ŷ�����ʵ��
	 */
    @Override  
    public Sender produce() {  
        return new SmsSender();  
    }  
}  
