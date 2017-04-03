package com.patterns.结构型.proxy.静态代理;

import com.patterns.结构型.proxy.Source;
import com.patterns.结构型.proxy.Sourceable;


/**
 * 代理模式注重控制对方法的访问
 */
public class Proxy implements Sourceable {
	private Source source;  
	/**
	 * 一般应在构造方法中进行实例化。并不应让访问者知道，你代理了哪个对象，但也不绝对如此
	 * 注意模式之间的区别主要在于目的而不是实现，静态代理模式虽然和装饰器模式的实现相似，但其目的并不一样，前者是强调控制，后者是强调装饰扩展，并不改变原有的方法
	 */
    public Proxy(){  
        super();  
        this.source = new Source();  
    }  
    @Override  
    public void method() {  
        before();  
        source.method();  
        atfer();  
    }  
    private void atfer() {  
        System.out.println("after proxy!");  
    }  
    private void before() {  
        System.out.println("before proxy!");  
    } 
}
