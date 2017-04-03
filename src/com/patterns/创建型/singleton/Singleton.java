package com.patterns.创建型.singleton;

/**
 * 懒汉模式创建单例
 */
public class Singleton {
	/* 持有私有静态实例，防止被引用，此处赋值为null，目的是实现延迟加载 */  
    private static Singleton instance = null;
  
    /* 私有构造方法，防止被实例化 */  
    private Singleton() { 
    	System.out.println("create Singleton");
    }  
  
    /**
     *  静态工程方法，创建实例 
     *  但是无线程安全保护
     */
    public static Singleton getInstance() {  
        if (instance == null) {  
            instance = new Singleton();  
        }  
        return instance;  
    }
    
    /**
     * synchronized关键字锁住的是这个对象，在性能上会有所下降，因为每次调用getInstance()，都要对对象上锁
     */
    public static synchronized Singleton getInstance1() {
    	if (instance == null) {
    		instance = new Singleton();
    	}
    	return instance;
    }  
    
    /**
     * 在Java指令中创建对象和赋值操作是分开进行的，也就是说instance = new Singleton();
     * 语句是分两步执行的。但是JVM并不保证这两个操作的先后顺序，也就是说有可能JVM会为新的Singleton实例分配空间，然后直接赋值给instance成员，然后再去初始化这个Singleton实例。
     */
    public static Singleton getInstance2() {
    	if (instance == null) {
    		synchronized(instance){
    	    	if (instance == null) {
    	    		instance = new Singleton();
    	    	}
    		}
    	}
    	return instance;
    }  

    /**
     * 使用内部类来维护单例的实现，JVM内部的机制能够保证当一个类被加载的时候，这个类的加载过程是线程互斥的  
     * 这种方式跟饿汉模式并不一样，饿汉模式当类加载时创建，这种方式是在SingletonFactory加载时创建，SingletonFactory是在调用getInstance3时加载，因此也有延迟加载的效果
     */
    public static Singleton getInstance3(){
    	System.out.println("getInstance3");
        return SingletonFactory.instance;
    }
	/**
	 * static修饰类的时候只能是内部类
	 * 普通的内部类对象隐含地保存了一个引用，指向创建它的外围类对象。
	 * 而且静态内部类的唯一作用就是可以直接作为一个普通类来使用，而不需实例一个外部类
	 */
    public static class SingletonFactory {
    	static {
        	System.out.println("SingletonFactory");
    	}
    	//非静态内部类中不可以声明静态成员
        private static Singleton instance = new Singleton();
    }
    
    
  
    /* 如果该对象被用于序列化，可以保证对象在序列化前后保持一致 */  
    public Object readResolve() {  
        return instance;  
    }  
}
