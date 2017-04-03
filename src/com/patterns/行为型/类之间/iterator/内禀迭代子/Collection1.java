package com.patterns.行为型.类之间.iterator.内禀迭代子;


/**
 * 同时保证聚集对象的封装和迭代子功能的实现的方案叫做黑箱实现方案
 * 
 * 聚集的接口没有提供修改聚集元素的方法，这样的接口就是所谓的窄接口
 * 
 * 由于迭代子是聚集的内部类，迭代子可以自由访问聚集的元素，所以迭代子可以自行实现迭代功能并控制对聚集元素的迭代逻辑。
 * 由于迭代子是在聚集的结构之内定义的，因此这样的迭代子又叫做内禀迭代子（Intrinsic Iterator）。
 */
public interface Collection1 {
	public Iterator1 iterator();  
}
