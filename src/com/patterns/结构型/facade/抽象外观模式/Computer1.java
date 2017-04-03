package com.patterns.结构型.facade.抽象外观模式;

import com.patterns.结构型.facade.CPU;
import com.patterns.结构型.facade.Memory;

/**
 * 增加的外观实现
 */
public class Computer1 implements AbstractComputer {
	private CPU cpu;  
    private Memory memory;  
      
    public Computer1(){  
        cpu = new CPU();  
        memory = new Memory();  
    }  

	@Override
	public void startup() {
        System.out.println("start the computer!");  
        cpu.startup();  
        memory.startup();  
        System.out.println("start computer finished!"); 
	}

	@Override
	public void shutdown() {
        System.out.println("begin to close the computer!");  
        cpu.shutdown();  
        memory.shutdown();  
        System.out.println("computer closed!");  
	}

}
