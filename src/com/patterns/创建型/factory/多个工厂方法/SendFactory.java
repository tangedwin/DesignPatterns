package com.patterns.创建型.factory.多个工厂方法;

import com.patterns.创建型.factory.MailSender;
import com.patterns.创建型.factory.Sender;
import com.patterns.创建型.factory.SmsSender;

/**
 * 工厂类
 * 是对普通工厂方法模式的改进，在普通工厂方法模式中，如果传递的字符串出错，则不能正确创建对象，而多个工厂方法模式是提供多个工厂方法，分别创建对象。
 */
public class SendFactory {
	public Sender produceMail(){
        return new MailSender();  
    }  
      
    public Sender produceSms(){  
        return new SmsSender();  
    }  
}
