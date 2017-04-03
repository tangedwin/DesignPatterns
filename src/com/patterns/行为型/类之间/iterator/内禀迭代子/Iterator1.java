package com.patterns.行为型.类之间.iterator.内禀迭代子;


/**
 * 
 */
public interface Iterator1 {
	//前移  
    public Object previous();  
      
    //后移  
    public Object next();  
    public boolean hasNext();  
      
    //取得第一个元素  
    public Object first();
}
