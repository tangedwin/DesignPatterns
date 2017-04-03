package com.patterns.创建型.singleton;

import org.junit.Test;

public class SingletonTest {
	
	@Test
	public void 无线程安全懒汉模式(){
		Singleton singleton = Singleton.getInstance3();
		System.out.println(singleton);
	}
	@Test
	public void synchronized方法懒汉模式(){
		Singleton singleton = Singleton.getInstance3();
		System.out.println(singleton);
	}
	@Test
	public void synchronized代码块懒汉模式(){
		Singleton singleton = Singleton.getInstance3();
		System.out.println(singleton);
	}
	@Test
	public void 内部类创建(){
		Singleton singleton = Singleton.getInstance3();
		System.out.println(singleton);
	}
}
