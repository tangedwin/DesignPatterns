package com.patterns.结构型.flyweight;

/**
 * String类型也是享元模式，如果常量池存在相同的字符串，将直接返回该地址而不会再创建
 * @author 308605
 *
 */
public abstract class Flyweight {
	public abstract void operation();
}
