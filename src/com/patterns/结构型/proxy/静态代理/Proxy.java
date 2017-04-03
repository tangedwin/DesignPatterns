package com.patterns.�ṹ��.proxy.��̬����;

import com.patterns.�ṹ��.proxy.Source;
import com.patterns.�ṹ��.proxy.Sourceable;


/**
 * ����ģʽע�ؿ��ƶԷ����ķ���
 */
public class Proxy implements Sourceable {
	private Source source;  
	/**
	 * һ��Ӧ�ڹ��췽���н���ʵ����������Ӧ�÷�����֪������������ĸ����󣬵�Ҳ���������
	 * ע��ģʽ֮���������Ҫ����Ŀ�Ķ�����ʵ�֣���̬����ģʽ��Ȼ��װ����ģʽ��ʵ�����ƣ�����Ŀ�Ĳ���һ����ǰ����ǿ�����ƣ�������ǿ��װ����չ�������ı�ԭ�еķ���
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
