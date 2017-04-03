package com.patterns.�ṹ��.adapter.����������;

import com.patterns.�ṹ��.adapter.��������.Source;
import com.patterns.�ṹ��.adapter.��������.Targetable;

/**
 * ��Adapter�����޸ģ���β��̳�Source�࣬���ǳ���Source���ʵ�����Դﵽ��������Ե�����
 */
public class Wrapper implements Targetable {
	private Source source;  
    
    public Wrapper(Source source){  
        super();  
        this.source = source;  
    }  
    @Override  
    public void method2() {  
        System.out.println("this is the targetable method!");  
    }  
  
    @Override  
    public void method1() {  
        source.method1();  
    }  

}
