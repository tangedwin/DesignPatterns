package com.patterns.������.factory.�����������;

import com.patterns.������.factory.MailSender;
import com.patterns.������.factory.Sender;
import com.patterns.������.factory.SmsSender;

/**
 * ������
 * �Ƕ���ͨ��������ģʽ�ĸĽ�������ͨ��������ģʽ�У�������ݵ��ַ�������������ȷ�������󣬶������������ģʽ���ṩ��������������ֱ𴴽�����
 */
public class SendFactory {
	public Sender produceMail(){
        return new MailSender();  
    }  
      
    public Sender produceSms(){  
        return new SmsSender();  
    }  
}
