package com.patterns.行为型.中间类.visitor;

public interface Subject {
	public void accept(Visitor visitor);  
    public String getSubject();
}
