package com.patterns.结构型.facade;

import org.junit.Test;

import com.patterns.结构型.facade.抽象外观模式.AbstractComputer;
import com.patterns.结构型.facade.抽象外观模式.Computer1;

public class FacadeTest {
	@Test
	public void 外观模式(){
		Computer computer = new Computer();  
        computer.startup();  
        computer.shutdown();
	}
	@Test
	public void 抽象外观模式(){
		AbstractComputer computer = new Computer();  
        computer.startup();  
        computer.shutdown();
		AbstractComputer computer1 = new Computer1();  
        computer1.startup();  
        computer1.shutdown();
	}
}
