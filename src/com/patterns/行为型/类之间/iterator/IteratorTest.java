package com.patterns.��Ϊ��.��֮��.iterator;

import org.junit.Test;

import com.patterns.��Ϊ��.��֮��.iterator.����������.Collection1;
import com.patterns.��Ϊ��.��֮��.iterator.����������.Iterator1;
import com.patterns.��Ϊ��.��֮��.iterator.����������.MyCollection1;
import com.patterns.��Ϊ��.��֮��.iterator.����������.Collection;
import com.patterns.��Ϊ��.��֮��.iterator.����������.Iterator;
import com.patterns.��Ϊ��.��֮��.iterator.����������.MyCollection;

public class IteratorTest {

	@Test
	public void ����������(){
		Collection collection = new MyCollection();  
        Iterator it = collection.iterator();  
          
        while(it.hasNext()){  
            System.out.println(it.next());  
        }  
	}
	
	@Test
	public void ����������(){
		Collection1 collection = new MyCollection1();  
        Iterator1 it = collection.iterator();  
          
        while(it.hasNext()){  
            System.out.println(it.next());  
        }  
	}
}
