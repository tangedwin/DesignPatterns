package com.patterns.��Ϊ��.��������.templateMethod;

public class Minus extends AbstractCalculator {
	
	private boolean isPrint = false;	
	/**
	 * �����ӷ����жϵ�ֵ�ṩ���ͻ�
	 */
    public void setIsPrint(boolean isPrint){
    	this.isPrint = isPrint;
    }
    
	/**
	 * ��������ʵ�ֵĹ��ӷ����Ը��෽����ִ�н���Լ����ʵ������Ը�����Ϊ�ķ������
	 * ��Ȼ������ģ�巽��������ͨ�����ӷ������ǻ����ܹ�Ӱ�쵽ģ�巽����ִ�У�����Ӱ�������߼���
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
