package com.patterns.�ṹ��.facade;

import org.junit.Test;

import com.patterns.�ṹ��.facade.�������ģʽ.AbstractComputer;
import com.patterns.�ṹ��.facade.�������ģʽ.Computer1;

public class FacadeTest {
	@Test
	public void ���ģʽ(){
		Computer computer = new Computer();  
        computer.startup();  
        computer.shutdown();
	}
	@Test
	public void �������ģʽ(){
		AbstractComputer computer = new Computer();  
        computer.startup();  
        computer.shutdown();
		AbstractComputer computer1 = new Computer1();  
        computer1.startup();  
        computer1.shutdown();
	}
}
