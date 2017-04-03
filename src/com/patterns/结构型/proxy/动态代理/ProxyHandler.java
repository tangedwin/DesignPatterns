package com.patterns.�ṹ��.proxy.��̬����;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * ��̬�������÷�����ƶ�̬�������ɣ����� AOP (����������) ˼��
 * 
 */
public class ProxyHandler implements InvocationHandler {
	//���������
    private Object mTarget;

    public ProxyHandler(Object target) {
        this.mTarget = target;
    }
    
    /**
     * ��������� ���ز��� �����
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
		 * ���ɴ�����
		 * ����1���������������������������������� 
		 * ����2����������ʵ�ֵĽӿڣ������Ĵ������ʵ��ָ�������нӿ� 
		 * ����3��������
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
