package com.patterns.结构型.decorator;

/**
 * 装饰模式就是给一个对象增加一些新的功能，而且是动态的，要求装饰对象和被装饰对象实现同一个接口，装饰对象持有被装饰对象的实例
 * 动态的为一个对象增加功能，而且还能动态撤销。（继承不能做到这一点，继承的功能是静态的，不能动态增删。）
 * 装饰者能够在运行时递归地被构造
 * 
 * 装饰模式主要是构造输入原对象进行装饰，主要关心的是为原对象添加新方法。代理模式主要关心的是访问的控制
 * IO流的装饰模式
 */
public class Decorator implements Sourceable {
	private Sourceable source;  
    
	/**
	 * 装饰器通常的做法是将原始对象作为一个参数传给装饰者的构造器
	 */
    public Decorator(Sourceable source){  
        super();  
        this.source = source;  
    }  
    
	@Override
	public void method() {
		System.out.println("before decorator!");  
        source.method();  
        System.out.println("after decorator!");  
	}

}
