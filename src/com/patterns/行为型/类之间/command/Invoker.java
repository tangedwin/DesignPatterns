package com.patterns.行为型.类之间.command;

/**
 * 调度类，要求该命令执行这个请求
 */
public class Invoker {
	private Command command;  
    
    public Invoker(Command command) {  
        this.command = command;  
    }  
  
    public void action(){  
        command.exe();  
    }  
}
