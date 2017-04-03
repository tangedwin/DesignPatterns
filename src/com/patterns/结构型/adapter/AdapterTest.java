package com.patterns.结构型.adapter;

import org.junit.Test;

import com.patterns.结构型.adapter.对象适配器.Wrapper;
import com.patterns.结构型.adapter.接口适配器.SourceSub1;
import com.patterns.结构型.adapter.接口适配器.SourceSub2;
import com.patterns.结构型.adapter.接口适配器.Sourceable;
import com.patterns.结构型.adapter.类适配器.Adapter;
import com.patterns.结构型.adapter.类适配器.Source;
import com.patterns.结构型.adapter.类适配器.Targetable;

public class AdapterTest {
	
	@Test
	public void 类适配器(){
		Targetable target = new Adapter();  
        target.method1();  
        target.method2(); 
	}
	
	@Test
	public void 对象适配器(){
		Source source = new Source();
		Targetable target = new Wrapper(source);
		target.method1();
		target.method2();
	}
	
	@Test
	public void 接口适配器(){
		Sourceable source1 = new SourceSub1();
		Sourceable source2 = new SourceSub2();
		source1.method1();
		source1.method2();
		source2.method1();
		source2.method2();  
	}
}
