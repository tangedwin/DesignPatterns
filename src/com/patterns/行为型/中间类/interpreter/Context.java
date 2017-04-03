package com.patterns.行为型.中间类.interpreter;

/**
 * 上下文，通常包含各个解释器需要的数据或是公共的功能
 */
public class Context {
	private int num1;  
    private int num2;  
      
    public Context(int num1, int num2) {  
        this.num1 = num1;  
        this.num2 = num2;  
    }  
      
    public int getNum1() {  
        return num1;  
    }  
    public void setNum1(int num1) {  
        this.num1 = num1;  
    }  
    public int getNum2() {  
        return num2;  
    }  
    public void setNum2(int num2) {  
        this.num2 = num2;  
    }
}
