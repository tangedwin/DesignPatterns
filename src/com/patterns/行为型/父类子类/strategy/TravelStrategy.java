package com.patterns.行为型.父类子类.strategy;


/**
 * 把每一个算法封装起来, 并且使它们可相互替换,且算法的变化不会影响到使用算法的客户
 * 
 * 实现不同算法可以提供多种查找算法，可以将这些算法写到一个类中，在该类中提供多个方法，每一个方法对应一个具体的查找算法；
 * 当然也可以将这些查找算法封装在一个统一的方法中，通过if…else…或者case等条件判断语句来进行选择。这两种实现方法我们都可以称之为硬编码
 */
public interface TravelStrategy {
	public void travelAlgorithm(String name);
}
