package com.patterns.������.singleton;

import org.junit.Test;

public class SingletonTest {
	
	@Test
	public void ���̰߳�ȫ����ģʽ(){
		Singleton singleton = Singleton.getInstance3();
		System.out.println(singleton);
	}
	@Test
	public void synchronized��������ģʽ(){
		Singleton singleton = Singleton.getInstance3();
		System.out.println(singleton);
	}
	@Test
	public void synchronized���������ģʽ(){
		Singleton singleton = Singleton.getInstance3();
		System.out.println(singleton);
	}
	@Test
	public void �ڲ��ഴ��(){
		Singleton singleton = Singleton.getInstance3();
		System.out.println(singleton);
	}
}
