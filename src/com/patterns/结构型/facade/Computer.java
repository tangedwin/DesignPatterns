package com.patterns.�ṹ��.facade;

import com.patterns.�ṹ��.facade.�������ģʽ.AbstractComputer;

/**
 * ͨ����۵İ�װ��ʹӦ�ó���ֻ�ܿ�����۶��󣬶����ῴ�������ϸ�ڶ����������ɻή��Ӧ�ó���ĸ��Ӷȣ���������˳���Ŀ�ά����
 */
public class Computer implements AbstractComputer {
	private CPU cpu;  
    private Memory memory;  
    private Disk disk;  
      
    public Computer(){  
        cpu = new CPU();  
        memory = new Memory();  
        disk = new Disk();  
    }  

	@Override
    public void startup(){  
        System.out.println("start the computer!");  
        cpu.startup();  
        memory.startup();  
        disk.startup();  
        System.out.println("start computer finished!");  
    }  

	@Override
    public void shutdown(){  
        System.out.println("begin to close the computer!");  
        cpu.shutdown();  
        memory.shutdown();  
        disk.shutdown();  
        System.out.println("computer closed!");  
    }
}
