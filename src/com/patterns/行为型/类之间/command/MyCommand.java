package com.patterns.行为型.类之间.command;

/**
 * 命令模式的目的就是达到命令的发出者和执行者之间解耦，实现请求和执行分开
 */
public class MyCommand implements Command {
	/**
	 * 具体命令类包含有一个接收者，将这个接收者对象绑定于一个动作
	 */
	private Receiver receiver;  
    
    public MyCommand(Receiver receiver) {  
        this.receiver = receiver;  
    }  
  
    @Override  
    public void exe() {  
        receiver.action();  
    }  
}
