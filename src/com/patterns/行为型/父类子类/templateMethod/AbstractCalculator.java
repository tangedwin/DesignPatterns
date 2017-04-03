package com.patterns.行为型.父类子类.templateMethod;

/**
 * 一个抽象类中，有一个主方法，再定义1...n个方法，可以是抽象的，也可以是实际的方法，
 * 定义一个类，继承该抽象类，重写抽象方法，通过调用抽象类，实现对子类的调用
 */
public abstract class AbstractCalculator {
	
	/**
	 * 钩子方法：判断是否打印公式
	 * 钩子方法应该是最开始设计就有的，而不是去完善、纠正错误的
	 * 必须是protected或者public以供子类覆写
	 */
	protected boolean isPrint() {
        return false;
    }	
	
	/**
	 * 主方法，外部调用的入口，实现对本类其它方法的调用
	 * 这里是final修饰的，防止子类进行修改
	 * 这个方法就是这个算法的框架，也就是模板
	 */  
    public final int calculate(String exp,String opt){
    	if(isPrint()){
    		System.out.print(exp+"=");
    	}
        int array[] = split(exp,opt);  
        return calculate(array[0],array[1]);  
    }  
      
    /**
     * 被子类重写的方法
     */
    abstract public int calculate(int num1,int num2);  
    
    /**
     * 辅助方法
     */
    public int[] split(String exp,String opt){  
        String array[] = exp.split(opt);  
        int arrayInt[] = new int[2];  
        arrayInt[0] = Integer.parseInt(array[0]);  
        arrayInt[1] = Integer.parseInt(array[1]);  
        return arrayInt;  
    }  
}
