/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *   |_Person
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 4. 21.
 * </pre>
 * 
 * @author : 강민
 * @version : 1.0
 */
public class Person {
	private String name;
	private int age;
	private int height;
	private int weight;

	public Person() {

	}

	public Person(String name, int age, int height, int weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}

	public int getHeight() {
		return age;
	}

	public int getWeight() {
		return age;
	}
	
	public void eat() {
		System.out.println(name + "(이)가 밥을 먹습니다.");
	}

	public void sleep() {
		System.out.println(name + "(이)가 잠을 잡니다.");
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", height=" + height + ", weight=" + weight + "]";
	}

}
