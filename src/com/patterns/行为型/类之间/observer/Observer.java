package com.patterns.行为型.类之间.observer;

public interface Observer {
	/*
	 * 为观察者定义的一个接口，在得到主题通知时更新自己
	 */
	public void update();
}
