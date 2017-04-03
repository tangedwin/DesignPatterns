package com.patterns.行为型.类之间.observer;

public class Observer1 implements Observer {

	@Override
	public void update() {
		System.out.println("observer1 has received!"); 
	}

}
