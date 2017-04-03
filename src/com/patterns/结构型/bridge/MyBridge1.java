package com.patterns.½á¹¹ÐÍ.bridge;

public class MyBridge1 extends Bridge {
	
	public MyBridge1(Sourceable source) {
		super(source);
	}

	public void method(){  
		System.out.print("first bridge and ");
        this.getSource().method();  
    }  
}
