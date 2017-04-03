package com.patterns.������.singleton;

/**
 * ����ģʽ��������
 */
public class Singleton {
	/* ����˽�о�̬ʵ������ֹ�����ã��˴���ֵΪnull��Ŀ����ʵ���ӳټ��� */  
    private static Singleton instance = null;
  
    /* ˽�й��췽������ֹ��ʵ���� */  
    private Singleton() { 
    	System.out.println("create Singleton");
    }  
  
    /**
     *  ��̬���̷���������ʵ�� 
     *  �������̰߳�ȫ����
     */
    public static Singleton getInstance() {  
        if (instance == null) {  
            instance = new Singleton();  
        }  
        return instance;  
    }
    
    /**
     * synchronized�ؼ�����ס������������������ϻ������½�����Ϊÿ�ε���getInstance()����Ҫ�Զ�������
     */
    public static synchronized Singleton getInstance1() {
    	if (instance == null) {
    		instance = new Singleton();
    	}
    	return instance;
    }  
    
    /**
     * ��Javaָ���д�������͸�ֵ�����Ƿֿ����еģ�Ҳ����˵instance = new Singleton();
     * ����Ƿ�����ִ�еġ�����JVM������֤�������������Ⱥ�˳��Ҳ����˵�п���JVM��Ϊ�µ�Singletonʵ������ռ䣬Ȼ��ֱ�Ӹ�ֵ��instance��Ա��Ȼ����ȥ��ʼ�����Singletonʵ����
     */
    public static Singleton getInstance2() {
    	if (instance == null) {
    		synchronized(instance){
    	    	if (instance == null) {
    	    		instance = new Singleton();
    	    	}
    		}
    	}
    	return instance;
    }  

    /**
     * ʹ���ڲ�����ά��������ʵ�֣�JVM�ڲ��Ļ����ܹ���֤��һ���౻���ص�ʱ�������ļ��ع������̻߳����  
     * ���ַ�ʽ������ģʽ����һ��������ģʽ�������ʱ���������ַ�ʽ����SingletonFactory����ʱ������SingletonFactory���ڵ���getInstance3ʱ���أ����Ҳ���ӳټ��ص�Ч��
     */
    public static Singleton getInstance3(){
    	System.out.println("getInstance3");
        return SingletonFactory.instance;
    }
	/**
	 * static�������ʱ��ֻ�����ڲ���
	 * ��ͨ���ڲ�����������ر�����һ�����ã�ָ�򴴽�������Χ�����
	 * ���Ҿ�̬�ڲ����Ψһ���þ��ǿ���ֱ����Ϊһ����ͨ����ʹ�ã�������ʵ��һ���ⲿ��
	 */
    public static class SingletonFactory {
    	static {
        	System.out.println("SingletonFactory");
    	}
    	//�Ǿ�̬�ڲ����в�����������̬��Ա
        private static Singleton instance = new Singleton();
    }
    
    
  
    /* ����ö����������л������Ա�֤���������л�ǰ�󱣳�һ�� */  
    public Object readResolve() {  
        return instance;  
    }  
}
