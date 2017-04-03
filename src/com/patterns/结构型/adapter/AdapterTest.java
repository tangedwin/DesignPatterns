package com.patterns.�ṹ��.adapter;

import org.junit.Test;

import com.patterns.�ṹ��.adapter.����������.Wrapper;
import com.patterns.�ṹ��.adapter.�ӿ�������.SourceSub1;
import com.patterns.�ṹ��.adapter.�ӿ�������.SourceSub2;
import com.patterns.�ṹ��.adapter.�ӿ�������.Sourceable;
import com.patterns.�ṹ��.adapter.��������.Adapter;
import com.patterns.�ṹ��.adapter.��������.Source;
import com.patterns.�ṹ��.adapter.��������.Targetable;

public class AdapterTest {
	
	@Test
	public void ��������(){
		Targetable target = new Adapter();  
        target.method1();  
        target.method2(); 
	}
	
	@Test
	public void ����������(){
		Source source = new Source();
		Targetable target = new Wrapper(source);
		target.method1();
		target.method2();
	}
	
	@Test
	public void �ӿ�������(){
		Sourceable source1 = new SourceSub1();
		Sourceable source2 = new SourceSub2();
		source1.method1();
		source1.method2();
		source2.method1();
		source2.method2();  
	}
}
