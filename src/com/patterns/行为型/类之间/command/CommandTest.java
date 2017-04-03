package com.patterns.行为型.类之间.command;

import org.junit.Test;

public class CommandTest {
	
	@Test
	public void 命令模式(){
		//命令执行者
		Receiver receiver = new Receiver();
		//命令
        Command cmd = new MyCommand(receiver);
        //调用者
        Invoker invoker = new Invoker(cmd);  
        invoker.action();
	}

}
