package com.patterns.��Ϊ��.�м���.visitor;


/**
 * ������ģʽ����һ�ַ���������ݽṹ����Ϊ�ķ�����ͨ�����ַ��룬�ɴﵽΪһ���������߶�̬����µĲ������������������޸ĵ�Ч��
 */
public class MySubject implements Subject {

	@Override  
    public void accept(Visitor visitor) {  
        visitor.visit(this);  
    }  
  
    @Override  
    public String getSubject() {  
        return "love";  
    }

}
