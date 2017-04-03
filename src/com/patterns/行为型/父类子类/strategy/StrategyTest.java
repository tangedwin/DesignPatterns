package com.patterns.��Ϊ��.��������.strategy;

import org.junit.Test;

public class StrategyTest {
	
	@Test
	public void ����ģʽ(){
		TravelStrategy travel1 = new AirPlanelStrategy();
		travel1.travelAlgorithm("Tom");
		TravelStrategy travel2 = new TrainStrategy();
		travel2.travelAlgorithm("Tom");
		TravelStrategy travel3 = new BicycleStrategy();
		travel3.travelAlgorithm("Tom");
	}
}
