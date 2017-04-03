package com.patterns.�ṹ��.bridge;


/**
 * ��������ʵ�ֻ����ʹ�ö��߿��Զ����仯
 * 
 * ����ʵ�ʵ���Ҫ��ĳ��������������������ϵ�ά�ȱ仯�����ֻ���ü̳н��޷�ʵ��������Ҫ������ʹ����Ʊ���൱ӷ�ס�
 * �Ž�ģʽ�������ǰѱ仯���ֳ��������ʹ�仯������������뿪�����Ӷ������ά�ȵı仯���׷��롣����ṩһ������������ϲ�ͬά���ϵı仯��ͨ���������������ҵ�����Ҫ��
 * 
 * ͨ��������ϵķ�ʽ��Bridge ģʽ��������ɫ֮��ļ̳й�ϵ��Ϊ����ϵĹ�ϵ���Ӷ�ʹ�����߿��Դ��������ĸ��Զ����ı仯����Ҳ��Bridgeģʽ�ı���
 */
public abstract class Bridge {
	private Sourceable source;  
	
	public Bridge(Sourceable source) {
		this.setSource(source);
	}
	
    public void method(){  
        source.method();  
    }  
      
    public Sourceable getSource() {  
        return source;  
    }  
  
    public void setSource(Sourceable source) {  
        this.source = source;  
    } 
}
