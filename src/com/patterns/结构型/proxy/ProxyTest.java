package com.patterns.结构型.proxy;

import org.junit.Test;

import com.patterns.结构型.proxy.动态代理.ProxyHandler;
import com.patterns.结构型.proxy.静态代理.Proxy;

public class ProxyTest {
	
	@Test
	public void 静态代理(){
		Sourceable source = new Proxy();  
        source.method(); 
	}
	
	@Test
	public void 动态代理(){
		Sourceable source =  new Source();
        ProxyHandler proxyHandler = new ProxyHandler(source);
        Sourceable agent = (Sourceable) proxyHandler.getProxy();
        agent.method();
	}
}
