package com.patterns.行为型.类之间.iterator.内禀迭代子;

public class MyCollection1 implements Collection1 {
	public String string[] = {"A","B","C","D","E"};  

	@Override
	public Iterator1 iterator() {
		return new MyIterator();  
	}

	/**
	 * 不对外提供修改聚集元素的方法
	 */
    private Object get(int i){
    	return string[i];
    } 
    
    private int size() {  
        return string.length;  
    } 
    
	/**
     * 内部成员类，具体迭代子类
     * 由于迭代子是聚集的内部类，迭代子可以自由访问聚集的元素，所以迭代子可以自行实现迭代功能并控制对聚集元素的迭代逻辑
     * 
     * 由于迭代子是在聚集的结构之内定义的，因此这样的迭代子又叫做内禀迭代子（Intrinsic Iterator）
     */
    private class MyIterator implements Iterator1{
    	//迭代器初始值为-1，每次调用next方法加1，每次调用previous方法减1
        private int pos = -1; 
    	

		@Override
		public Object previous() {
			if(pos > 0){  
	            pos--;  
	        }  
	        return get(pos);
		}

		@Override
		public Object next() {
	        if(pos<size()-1){  
	            pos++;  
	        }  
	        return get(pos); 
		}

		@Override
		public boolean hasNext() {
	        if(pos<size()-1){  
	            return true;  
	        }else{  
	            return false;  
	        }  
		}

		@Override
		public Object first() {
	        pos = 0;  
	        return get(pos);  
		}
	}
}
