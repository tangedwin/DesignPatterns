package com.patterns.�ṹ��.decorator;

/**
 * װ��ģʽ���Ǹ�һ����������һЩ�µĹ��ܣ������Ƕ�̬�ģ�Ҫ��װ�ζ���ͱ�װ�ζ���ʵ��ͬһ���ӿڣ�װ�ζ�����б�װ�ζ����ʵ��
 * ��̬��Ϊһ���������ӹ��ܣ����һ��ܶ�̬���������̳в���������һ�㣬�̳еĹ����Ǿ�̬�ģ����ܶ�̬��ɾ����
 * װ�����ܹ�������ʱ�ݹ�ر�����
 * 
 * װ��ģʽ��Ҫ�ǹ�������ԭ�������װ�Σ���Ҫ���ĵ���Ϊԭ��������·���������ģʽ��Ҫ���ĵ��Ƿ��ʵĿ���
 * IO����װ��ģʽ
 */
public class Decorator implements Sourceable {
	private Sourceable source;  
    
	/**
	 * װ����ͨ���������ǽ�ԭʼ������Ϊһ����������װ���ߵĹ�����
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
