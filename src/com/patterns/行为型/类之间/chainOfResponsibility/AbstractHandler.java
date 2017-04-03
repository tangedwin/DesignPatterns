package com.patterns.行为型.类之间.chainOfResponsibility;

public abstract class AbstractHandler {
	private Handler handler;  
	  
    public Handler getHandler() {  
        return handler;  
    }  
  
    public void setHandler(Handler handler) {  
        this.handler = handler;  
    }
}
