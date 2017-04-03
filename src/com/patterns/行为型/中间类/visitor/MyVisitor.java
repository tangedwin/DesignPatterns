package com.patterns.行为型.中间类.visitor;

public class MyVisitor implements Visitor {

	@Override  
    public void visit(Subject sub) {  
        System.out.println("visit the subject："+sub.getSubject());  
    }
}
