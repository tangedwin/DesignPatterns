package com.patterns.������.factory.��̬��������;

import com.patterns.������.factory.MailSender;
import com.patterns.������.factory.Sender;
import com.patterns.������.factory.SmsSender;

/**
 * ������
 * �������������ģʽ��ķ�����Ϊ��̬�ģ�����Ҫ����ʵ����ֱ�ӵ��ü��ɡ�
 */
public class SendFactory {
	public static Sender produceMail(){  
        return new MailSender();  
    }  
      
    public static Sender produceSms(){  
        return new SmsSender();  
    }  
}
