package com.patterns.行为型.父类子类.strategy;

public class TrainStrategy extends AbstractStrategy implements TravelStrategy {

	@Override
	public void travelAlgorithm(String name) {
		this.printName(name);
		System.out.println("travel by Train");
	}

}
