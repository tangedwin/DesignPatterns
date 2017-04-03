package com.patterns.行为型.类之间.observer;

import java.util.Enumeration;
import java.util.Vector;


/**
 * 将一个系统分割成一个一些类相互协作的类有一个不好的副作用，那就是需要维护相关对象间的一致性。
 * 我们不希望为了维持一致性而使各类紧密耦合，这样会给维护、扩展和重用都带来不便。观察者就是解决这类的耦合关系的。
 * 
 * 观察者模式解除了主题和具体观察者的耦合，让耦合的双方都依赖于抽象，而不是依赖具体
 * 当一个对象变化时，其它依赖该对象的对象都会收到通知，并且随着变化
 */
public abstract class AbstractSubject implements Subject {
	/**
	 * 需要监控的对象列表
	 * 所有观察者对象的引用保存到这个列表里
	 */
	private Vector<Observer> vector = new Vector<Observer>();  
    @Override  
    public void add(Observer observer) {  
        vector.add(observer);  
    }  
  
    @Override  
    public void del(Observer observer) {  
        vector.remove(observer);  
    }  
  
    /**
     * 当Subject变化时，负责通知在列表内存在的对象
     */
    @Override  
    public void notifyObservers() {  
        Enumeration<Observer> enumo = vector.elements();  
        while(enumo.hasMoreElements()){  
            enumo.nextElement().update();  
        }  
    }
}
