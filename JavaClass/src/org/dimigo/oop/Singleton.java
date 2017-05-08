/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   |_Singleton
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 4. 20.
 * </pre>
 * 
 * @author : 강민
 * @version : 1.0
 */
public class Singleton {
	//클래스가 로드되는 시점에 객체가 생성됨
	private static Singleton instance;
	
	//new로 객체 생성을 못함
	private Singleton(){
		
	}
	
	public static Singleton getInstance() {
		return instance;
	}
	
	//필요한 시점에 객체를 생성하는 방식 (Lazy Initialization 방식)
	public static synchronized Singleton getInstance2(){
		if(instance==null)
			instance = new Singleton();
		return instance;
	}
}
