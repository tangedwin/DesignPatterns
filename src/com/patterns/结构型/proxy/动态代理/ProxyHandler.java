package com.patterns.结构型.proxy.动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态代理运用反射机制动态创建而成，符合 AOP (面向切面编程) 思想
 * 
 */
public class ProxyHandler implements InvocationHandler {
	//被代理对象
    private Object mTarget;

    public ProxyHandler(Object target) {
        this.mTarget = target;
    }
    
    /**
     * 代理类进行 拦截操作 的入口
     */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		Object result = null;
		this.before();
		if("method".equals(method.getName())){
			result = method.invoke(mTarget, args);
			this.atfer();
		}
		return result;
	} 
	public Object getProxy() {
		/**
		 * 生成代理类
		 * 参数1：被代理类的类加载器，用来创建代理类 
		 * 参数2：被代理类实现的接口，创建的代理类会实现指定的所有接口 
		 * 参数3：代理类
		 */
        return Proxy.newProxyInstance(mTarget.getClass().getClassLoader(), mTarget.getClass().getInterfaces(), this);
    }
    private void atfer() {  
        System.out.println("after proxy!");  
    }  
    private void before() {  
        System.out.println("before proxy!");  
    } 

}
