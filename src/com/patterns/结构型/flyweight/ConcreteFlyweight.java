package com.patterns.�ṹ��.flyweight;

public class ConcreteFlyweight extends Flyweight {
	private String string; 
	public ConcreteFlyweight(String str){
		string = str;
	} 
	
	@Override
	public void operation(){
		System.out.println("Concrete---Flyweight : " + string);
	}  
}
