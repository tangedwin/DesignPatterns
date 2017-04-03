package com.patterns.行为型.类之间.iterator;

import org.junit.Test;

import com.patterns.行为型.类之间.iterator.内禀迭代子.Collection1;
import com.patterns.行为型.类之间.iterator.内禀迭代子.Iterator1;
import com.patterns.行为型.类之间.iterator.内禀迭代子.MyCollection1;
import com.patterns.行为型.类之间.iterator.外禀迭代子.Collection;
import com.patterns.行为型.类之间.iterator.外禀迭代子.Iterator;
import com.patterns.行为型.类之间.iterator.外禀迭代子.MyCollection;

public class IteratorTest {

	@Test
	public void 外禀迭代子(){
		Collection collection = new MyCollection();  
        Iterator it = collection.iterator();  
          
        while(it.hasNext()){  
            System.out.println(it.next());  
        }  
	}
	
	@Test
	public void 内禀迭代子(){
		Collection1 collection = new MyCollection1();  
        Iterator1 it = collection.iterator();  
          
        while(it.hasNext()){  
            System.out.println(it.next());  
        }  
	}
}
