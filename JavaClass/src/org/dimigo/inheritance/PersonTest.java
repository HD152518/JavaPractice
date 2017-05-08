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
 * 2. 작성일 : 2017. 4. 21.
 * </pre>
 * 
 * @author : 강민
 * @version : 1.0
 */
public class PersonTest {

	public static void main(String[] args) {
		Person p = new Person("주현도", 18, 178, 65);
		System.out.println(p);
		
		p.eat();
		p.sleep();
		
		Student s = new Student("주동명", 17, 178, 65, "2534");
		System.out.println(s);
		//자식 클래스에 있는 메소드
		s.study();
		s.eatSnack();
		
		//부모 클래스에 있는 메소드
		s.eat();
		s.sleep();
	}

}
