package com.patterns.�ṹ��.proxy;

import org.junit.Test;

import com.patterns.�ṹ��.proxy.��̬����.ProxyHandler;
import com.patterns.�ṹ��.proxy.��̬����.Proxy;

public class ProxyTest {
	
	@Test
	public void ��̬����(){
		Sourceable source = new Proxy();  
        source.method(); 
	}
	
	@Test
	public void ��̬����(){
		Sourceable source =  new Source();
        ProxyHandler proxyHandler = new ProxyHandler(source);
        Sourceable agent = (Sourceable) proxyHandler.getProxy();
        agent.method();
	}
}
