package com.patterns.行为型.父类子类.templateMethod;

import org.junit.Test;

public class TemplateMethodTest {
	
	@Test
	public void 模版方法模式(){
		String exp = "8+8";  
        AbstractCalculator cal = new Plus();  
        //这里调用的是抽象类中的主方法，不必知道子类实现的具体方法
        int result = cal.calculate(exp, "\\+");  
        System.out.println(result);
        

		String exp1 = "12-3";  
        AbstractCalculator cal1 = new Minus();
        //通过子类的钩子方法影响模版的执行
        ((Minus)cal1).setIsPrint(true);
        int result1 = cal1.calculate(exp1, "\\-");  
        System.out.println(result1);
	}
}
