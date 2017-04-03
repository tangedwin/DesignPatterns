package com.patterns.��Ϊ��.��֮��.observer;

import java.util.Enumeration;
import java.util.Vector;


/**
 * ��һ��ϵͳ�ָ��һ��һЩ���໥Э��������һ�����õĸ����ã��Ǿ�����Ҫά����ض�����һ���ԡ�
 * ���ǲ�ϣ��Ϊ��ά��һ���Զ�ʹ���������ϣ��������ά������չ�����ö��������㡣�۲��߾��ǽ���������Ϲ�ϵ�ġ�
 * 
 * �۲���ģʽ���������;���۲��ߵ���ϣ�����ϵ�˫���������ڳ��󣬶�������������
 * ��һ������仯ʱ�����������ö���Ķ��󶼻��յ�֪ͨ���������ű仯
 */
public abstract class AbstractSubject implements Subject {
	/**
	 * ��Ҫ��صĶ����б�
	 * ���й۲��߶�������ñ��浽����б���
	 */
	private Vector<Observer> vector = new Vector<Observer>();  
    @Override  
    public void add(Observer observer) {  
        vector.add(observer);  
    }  
  
    @Override  
    public void del(Observer observer) {  
        vector.remove(observer);  
    }  
  
    /**
     * ��Subject�仯ʱ������֪ͨ���б��ڴ��ڵĶ���
     */
    @Override  
    public void notifyObservers() {  
        Enumeration<Observer> enumo = vector.elements();  
        while(enumo.hasMoreElements()){  
            enumo.nextElement().update();  
        }  
    }
}
