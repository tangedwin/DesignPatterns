package com.patterns.创建型.factory.静态工厂方法;

import com.patterns.创建型.factory.MailSender;
import com.patterns.创建型.factory.Sender;
import com.patterns.创建型.factory.SmsSender;

/**
 * 工厂类
 * 将多个工厂方法模式里的方法置为静态的，不需要创建实例，直接调用即可。
 */
public class SendFactory {
	public static Sender produceMail(){  
        return new MailSender();  
    }  
      
    public static Sender produceSms(){  
        return new SmsSender();  
    }  
}
