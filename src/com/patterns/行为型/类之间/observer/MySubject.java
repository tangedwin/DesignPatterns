package com.patterns.��Ϊ��.��֮��.observer;

public class MySubject extends AbstractSubject {
	
	/**
	 * ���ڲ�״̬�ı�ʱ�������еǼǹ��Ĺ۲��߷���֪ͨ
	 */
	@Override
	public void operation() {
		System.out.println("update self!");  
        notifyObservers();
	}

}
