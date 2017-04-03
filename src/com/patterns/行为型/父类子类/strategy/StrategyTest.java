package com.patterns.行为型.父类子类.strategy;

import org.junit.Test;

public class StrategyTest {
	
	@Test
	public void 策略模式(){
		TravelStrategy travel1 = new AirPlanelStrategy();
		travel1.travelAlgorithm("Tom");
		TravelStrategy travel2 = new TrainStrategy();
		travel2.travelAlgorithm("Tom");
		TravelStrategy travel3 = new BicycleStrategy();
		travel3.travelAlgorithm("Tom");
	}
}
