package com.patterns.½á¹¹ÐÍ.bridge;

public class MyBridge2 extends Bridge {
	
	public MyBridge2(Sourceable source) {
		super(source);
	}

	public void method(){  
		System.out.print("second bridge and ");
        this.getSource().method();  
    }  
}
