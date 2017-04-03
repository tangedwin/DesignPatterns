package com.patterns.结构型.facade.抽象外观模式;

/**
 * 由外观类实现，当增加子系统时，不必修改外观类实现，只增加一个新的外观类实现即可
 * 当增加新的子系统或者移除子系统时需要修改外观类，可以通过引入抽象外观类在一定程度上解决该问题，客户端针对抽象外观类进行编程。
 */
public interface AbstractComputer {
	public void startup();
	public void shutdown();
}
