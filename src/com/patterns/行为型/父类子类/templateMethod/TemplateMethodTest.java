package com.patterns.��Ϊ��.��������.templateMethod;

import org.junit.Test;

public class TemplateMethodTest {
	
	@Test
	public void ģ�淽��ģʽ(){
		String exp = "8+8";  
        AbstractCalculator cal = new Plus();  
        //������õ��ǳ������е�������������֪������ʵ�ֵľ��巽��
        int result = cal.calculate(exp, "\\+");  
        System.out.println(result);
        

		String exp1 = "12-3";  
        AbstractCalculator cal1 = new Minus();
        //ͨ������Ĺ��ӷ���Ӱ��ģ���ִ��
        ((Minus)cal1).setIsPrint(true);
        int result1 = cal1.calculate(exp1, "\\-");  
        System.out.println(result1);
	}
}
