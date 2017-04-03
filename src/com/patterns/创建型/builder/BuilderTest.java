package com.patterns.创建型.builder;

import org.junit.Test;

public class BuilderTest {
	@Test
	public void 建造者模式() {
		Builder builder = new Builder();  
        builder.produceMailSender(10);  
	}
}
