package com.patterns.��Ϊ��.��֮��.command;

import org.junit.Test;

public class CommandTest {
	
	@Test
	public void ����ģʽ(){
		//����ִ����
		Receiver receiver = new Receiver();
		//����
        Command cmd = new MyCommand(receiver);
        //������
        Invoker invoker = new Invoker(cmd);  
        invoker.action();
	}

}
