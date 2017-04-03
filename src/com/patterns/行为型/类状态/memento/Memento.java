package com.patterns.行为型.类状态.memento;

/**
 * 主要目的是保存一个对象的某个状态，以便在适当的时候恢复对象
 */
public class Memento {
	private String value;  
	  
    public Memento(String value) {  
        this.value = value;  
    }  
  
    public String getValue() {  
        return value;  
    }  
  
    public void setValue(String value) {  
        this.value = value;  
    }
}
