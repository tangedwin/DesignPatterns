package com.patterns.结构型.composite;

import org.junit.Test;

public class CompositeTest {
	@Test
	public void 组合模式(){
        TreeNode nodeA = new TreeNode("A");  
        TreeNode nodeB = new TreeNode("B");  
        TreeNode nodeC1 = new TreeNode("C1");  
        TreeNode nodeC2 = new TreeNode("C2"); 
          
        nodeB.add(nodeC1);  
        nodeB.add(nodeC2);  
        nodeA.add(nodeB);  
        System.out.println("build the tree finished!");
	}
}
