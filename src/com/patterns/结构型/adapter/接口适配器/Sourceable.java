package com.patterns.结构型.adapter.接口适配器;

/**
 * 接口中有多个抽象方法
 * 但实现时可能有些方法不需要实现
 */
public interface Sourceable {
	public void method1();  
    public void method2(); 
}
