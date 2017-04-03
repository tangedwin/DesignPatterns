package com.patterns.结构型.bridge;

import org.junit.Test;

public class BridgeTest {
	@Test
	public void 桥接模式(){
		new MyBridge1(new SourceSub1()).method();
		new MyBridge1(new SourceSub2()).method();
		new MyBridge2(new SourceSub1()).method();
		new MyBridge2(new SourceSub2()).method();
	}
}
