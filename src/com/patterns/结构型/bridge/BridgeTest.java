package com.patterns.�ṹ��.bridge;

import org.junit.Test;

public class BridgeTest {
	@Test
	public void �Ž�ģʽ(){
		new MyBridge1(new SourceSub1()).method();
		new MyBridge1(new SourceSub2()).method();
		new MyBridge2(new SourceSub1()).method();
		new MyBridge2(new SourceSub2()).method();
	}
}
