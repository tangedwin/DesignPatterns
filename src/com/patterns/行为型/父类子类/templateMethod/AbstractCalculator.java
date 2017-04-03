package com.patterns.��Ϊ��.��������.templateMethod;

/**
 * һ���������У���һ�����������ٶ���1...n�������������ǳ���ģ�Ҳ������ʵ�ʵķ�����
 * ����һ���࣬�̳иó����࣬��д���󷽷���ͨ�����ó����࣬ʵ�ֶ�����ĵ���
 */
public abstract class AbstractCalculator {
	
	/**
	 * ���ӷ������ж��Ƿ��ӡ��ʽ
	 * ���ӷ���Ӧ�����ʼ��ƾ��еģ�������ȥ���ơ����������
	 * ������protected����public�Թ����าд
	 */
	protected boolean isPrint() {
        return false;
    }	
	
	/**
	 * ���������ⲿ���õ���ڣ�ʵ�ֶԱ������������ĵ���
	 * ������final���εģ���ֹ��������޸�
	 * ���������������㷨�Ŀ�ܣ�Ҳ����ģ��
	 */  
    public final int calculate(String exp,String opt){
    	if(isPrint()){
    		System.out.print(exp+"=");
    	}
        int array[] = split(exp,opt);  
        return calculate(array[0],array[1]);  
    }  
      
    /**
     * ��������д�ķ���
     */
    abstract public int calculate(int num1,int num2);  
    
    /**
     * ��������
     */
    public int[] split(String exp,String opt){  
        String array[] = exp.split(opt);  
        int arrayInt[] = new int[2];  
        arrayInt[0] = Integer.parseInt(array[0]);  
        arrayInt[1] = Integer.parseInt(array[1]);  
        return arrayInt;  
    }  
}
