package com.patterns.�ṹ��.adapter.��������;



/**
 * ��ϣ����һ����ת����������һ���½ӿڵ���ʱ������ʹ�����������ģʽ
 * ��һ��Source�࣬ӵ��һ�������������䣬Ŀ��ӿ�ʱTargetable��ͨ��Adapter�࣬��Source�Ĺ�����չ��Targetable��
 */
public class Adapter extends Source implements Targetable {

	@Override
	public void method2() {
		System.out.println("this is the targetable method!");  
	}

}
