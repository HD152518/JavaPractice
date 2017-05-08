/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *   |_Teacher
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 4. 21.
 * </pre>
 * 
 * @author : 강민
 * @version : 1.0
 */
public class Teacher extends Person{
	private String subject;

	public Teacher(String name, int age, int height, int weight, String subject) {
		super(name, age, height, weight);
	}
	
	public void teach() {
		System.out.println(super.getName() + "쌤이 공부를 가르치십니다.");
	}

	@Override
	public String toString() {
		return "Teacher [subject=" + subject + super.toString();
	}
}
