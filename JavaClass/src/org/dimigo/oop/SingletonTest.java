/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   |_SingletonTest
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 4. 20.
 * </pre>
 * 
 * @author : 강민
 * @version : 1.0
 */
public class SingletonTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Singleton s1 = Singleton.getInstance2();
		Singleton s2 = Singleton.getInstance2();
		
		System.out.println(s1);
		System.out.println(s2);
	}

}
