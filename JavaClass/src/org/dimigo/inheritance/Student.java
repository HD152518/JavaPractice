/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *   |_Student
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 4. 21.
 * </pre>
 * 
 * @author : 강민
 * @version : 1.0
 */
public class Student extends Person{
	private String studentId;
	
	public Student(String name, int age, int height, int weight, String studentId) {
		super(name, age, height, weight);
		
		this.studentId = studentId;
	}
	
	public void study() {
		System.out.println(super.getName() + " 학생이 공부를 합니다.");
	}
	
	public void eatSnack() {
		System.out.println(super.getName() + "학생이 과자를 먹습니다.");
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + super.toString();
	}
}
