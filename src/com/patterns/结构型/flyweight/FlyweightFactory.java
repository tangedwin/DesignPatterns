package com.patterns.结构型.flyweight;

import java.util.Hashtable;

/**
 * 由于要产生各种各样的对象，所以在Flyweight(享元)模式中常出现Factory模式
 */
public class FlyweightFactory {
	//定义一个Hashtable用来存储各个对象
	private Hashtable<Object, Flyweight> flyweights = new Hashtable<Object, Flyweight>();
	
	public FlyweightFactory(){
		
	}
	
	public Flyweight getFlyWeight(Object obj){
		Flyweight flyweight = (Flyweight) flyweights.get(obj);
		//如果在Hashtable中没有要选择的对象，产生一个新的flyweight存储在Hashtable中，并将该对象返回
		if(flyweight == null){
			//产生新的ConcreteFlyweight
			flyweight = new ConcreteFlyweight((String)obj);
			flyweights.put(obj, flyweight);
		}
		return flyweight;
	}
	
	public int getFlyweightSize(){
		return flyweights.size();
	}  
}
