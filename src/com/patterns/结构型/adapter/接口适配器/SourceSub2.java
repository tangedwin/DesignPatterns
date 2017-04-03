package com.patterns.结构型.adapter.接口适配器;

/**
 * 继承一个抽象类Wrapper，因为Wrapper的方法全都已经实现，因此只实现需要实现的方法即可
 */
public class SourceSub2 extends Wrapper {
	public void method2(){  
        System.out.println("the sourceable interface's second Sub2!");  
    }  
}
