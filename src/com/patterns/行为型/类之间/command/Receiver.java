package com.patterns.行为型.类之间.command;

/**
 * 接收者类，知道如何实施与执行一个请求相关的操作，任何类都可能作为一个接收者。
 */
public class Receiver {
	/**
	 * 真正的命令实现
	 */
	public void action(){  
        System.out.println("command received!");  
    }  
}
