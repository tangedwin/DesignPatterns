package com.patterns.行为型.类之间.observer;

public class MySubject extends AbstractSubject {
	
	/**
	 * 在内部状态改变时，给所有登记过的观察者发出通知
	 */
	@Override
	public void operation() {
		System.out.println("update self!");  
        notifyObservers();
	}

}
