package com.patterns.创建型.factory.普通工厂方法;

import com.patterns.创建型.factory.MailSender;
import com.patterns.创建型.factory.Sender;
import com.patterns.创建型.factory.SmsSender;

/**
 * 工厂类
 * 普通工厂模式，就是建立一个工厂类，对实现了同一接口的一些类进行实例的创建
 */
public class SendFactory {
	public Sender produce(String type) {  
        if ("mail".equals(type)) {  
            return new MailSender();  
        } else if ("sms".equals(type)) {  
            return new SmsSender();  
        } else {  
            System.out.println("请输入正确的类型!");  
            return null;  
        }  
    }  
}
