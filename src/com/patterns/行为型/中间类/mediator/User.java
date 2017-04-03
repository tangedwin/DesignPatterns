package com.patterns.行为型.中间类.mediator;

public abstract class User {
	private Mediator mediator;  
    
    public Mediator getMediator(){  
        return mediator;  
    }  
      
    public User(Mediator mediator) {  
        this.mediator = mediator;  
    }  
  
    public abstract void work();
}
