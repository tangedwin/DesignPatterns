package com.patterns.行为型.类状态.memento;

/**
 * 用于管理备忘录
 */
public class Storage {
	private Memento memento;  
    
    public Storage(Memento memento) {  
        this.memento = memento;  
    }  
  
    public Memento getMemento() {  
        return memento;  
    }  
  
    public void setMemento(Memento memento) {  
        this.memento = memento;  
    }
}
