package com.patterns.��Ϊ��.��֮��.command;

/**
 * ����ģʽ��Ŀ�ľ��Ǵﵽ����ķ����ߺ�ִ����֮����ʵ�������ִ�зֿ�
 */
public class MyCommand implements Command {
	/**
	 * ���������������һ�������ߣ�����������߶������һ������
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
