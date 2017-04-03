package com.patterns.行为型.中间类.mediator;

public class User2 extends User {
	public User2(Mediator mediator){  
        super(mediator);  
    }  
      
    @Override  
    public void work() {  
        System.out.println("user2 exe!");  
    }
}
