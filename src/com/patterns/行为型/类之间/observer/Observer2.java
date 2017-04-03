package com.patterns.行为型.类之间.observer;

public class Observer2 implements Observer {

	@Override
	public void update() {
		System.out.println("observer2 has received!");
	}

}
