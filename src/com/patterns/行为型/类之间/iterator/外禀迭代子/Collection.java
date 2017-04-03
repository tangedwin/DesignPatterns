package com.patterns.行为型.类之间.iterator.外禀迭代子;


/**
 * 提供宽接口的聚集叫做白箱聚集
 * 由于聚集自己实现迭代逻辑，并向外部提供适当的接口，使得迭代子可以从外部控制聚集元素的迭代过程。这
 * 样一来迭代子所控制的仅仅是一个游标而已，这种迭代子叫做游标迭代子（Cursor Iterator）。
 * 由于迭代子是在聚集结构之外的，因此这样的迭代子又叫做外禀迭代子（Extrinsic Iterator）。
 */
public interface Collection {
	public Iterator iterator();  
    
    /**
     * 取得集合元素
     * 聚集的接口提供了可以用来修改聚集元素的方法，这个接口就是所谓的宽接口
     */  
    public Object get(int i);  
      
    /*取得集合大小*/  
    public int size();
}
