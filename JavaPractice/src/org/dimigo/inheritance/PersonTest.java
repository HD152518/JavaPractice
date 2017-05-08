/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *   |_PersonTest
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 5. 8.
 * </pre>
 * 
 * @author : 강민
 * @version : 1.0
 */
public class PersonTest {

	public static void main(String[] args) {
		
		Person tom = new Person("Tom");
		System.out.println(tom);
		
		Korean 홍길동 = new Korean("홍길동");
		System.out.println(홍길동);

		Japanese 다나카 = new Japanese("다나카");
		System.out.println(다나카);
		
		Chinese 왕밍 = new Chinese("왕밍");
		System.out.println(왕밍);
		
		System.out.println("");
		
		tom.sayHello();
		홍길동.sayHello();
		다나카.sayHello();
		왕밍.sayHello();
		
		System.out.println("");
		
		tom.sayBye();
		홍길동.sayBye();
		다나카.sayBye();
		왕밍.sayBye();
	}
}
