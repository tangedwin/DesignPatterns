package com.patterns.������.factory.��ͨ��������;

import com.patterns.������.factory.MailSender;
import com.patterns.������.factory.Sender;
import com.patterns.������.factory.SmsSender;

/**
 * ������
 * ��ͨ����ģʽ�����ǽ���һ�������࣬��ʵ����ͬһ�ӿڵ�һЩ�����ʵ���Ĵ���
 */
public class SendFactory {
	public Sender produce(String type) {  
        if ("mail".equals(type)) {  
            return new MailSender();  
        } else if ("sms".equals(type)) {  
            return new SmsSender();  
        } else {  
            System.out.println("��������ȷ������!");  
            return null;  
        }  
    }  
}
