package com.patterns.��Ϊ��.��������.strategy;

public class TrainStrategy extends AbstractStrategy implements TravelStrategy {

	@Override
	public void travelAlgorithm(String name) {
		this.printName(name);
		System.out.println("travel by Train");
	}

}
