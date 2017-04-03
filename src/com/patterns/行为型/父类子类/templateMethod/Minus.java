package com.patterns.行为型.父类子类.templateMethod;

public class Minus extends AbstractCalculator {
	
	private boolean isPrint = false;	
	/**
	 * 将钩子方法判断的值提供给客户
	 */
    public void setIsPrint(boolean isPrint){
    	this.isPrint = isPrint;
    }
    
	/**
	 * 在子类中实现的钩子方法对父类方法的执行进行约束，实现子类对父类行为的反向控制
	 * 虽然这里是模板方法，但是通过钩子方法我们还是能够影响到模板方法的执行（不是影响它的逻辑）
	 */
    @Override
    protected boolean isPrint(){
        return this.isPrint;
    }
	
	@Override
	public int calculate(int num1, int num2) {
		return num1 - num2;
	}

}
