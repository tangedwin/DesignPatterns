package com.patterns.��Ϊ��.��֮��.chainOfResponsibility;


/**
 * �ж������ÿ��������ж���һ����������ã������ͻ��γ�һ�������������������ϴ��ݣ�ֱ��ĳһ����������������
 * 
 * ������ģʽ����ʵ�֣��������ͻ��˵�����£���ϵͳ���ж�̬�ĵ���
 * 
 * �����ϵ����������һ������������һ��������������һ������ģʽ����Լ���������Ҫ�����Լ�ȥʵ�֣�
 * ͬʱ����һ��ʱ�̣�����ֻ������һ�����󴫸���һ�����󣬶����������������
 */
public class MyHandler extends AbstractHandler implements Handler {
	private String name;  
	  
    public MyHandler(String name) {  
        this.name = name;  
    }  
  
    @Override  
    public void operator() {  
        System.out.println(name+" deal!");
        //������ݸ���һ������Ϊ�����������ȥ����һ���Ǳ����
        if(getHandler()!=null){
            getHandler().operator();  
        } 
        System.out.println(name+" done!");   
    }
}
