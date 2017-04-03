package com.patterns.�ṹ��.flyweight;

import java.util.Hashtable;

/**
 * ����Ҫ�������ָ����Ķ���������Flyweight(��Ԫ)ģʽ�г�����Factoryģʽ
 */
public class FlyweightFactory {
	//����һ��Hashtable�����洢��������
	private Hashtable<Object, Flyweight> flyweights = new Hashtable<Object, Flyweight>();
	
	public FlyweightFactory(){
		
	}
	
	public Flyweight getFlyWeight(Object obj){
		Flyweight flyweight = (Flyweight) flyweights.get(obj);
		//�����Hashtable��û��Ҫѡ��Ķ��󣬲���һ���µ�flyweight�洢��Hashtable�У������ö��󷵻�
		if(flyweight == null){
			//�����µ�ConcreteFlyweight
			flyweight = new ConcreteFlyweight((String)obj);
			flyweights.put(obj, flyweight);
		}
		return flyweight;
	}
	
	public int getFlyweightSize(){
		return flyweights.size();
	}  
}
