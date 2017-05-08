/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   |_Car
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 4. 18.
 * </pre>
 * 
 * @author : 강민
 * @version : 1.0
 */
public class Car {
	private static String company;
	private String name;
	
	
	public Car(String name) {
		super();
		this.name = name;
	}

	// 1. Static 메소드에서 Static 필드 호출 가능
	public static String getCompany() {
		return company;
	}

	public static void setCompany(String company) {
		Car.company = company;
	}

	// 2. 인스턴스 메소드에서 인스턴스 필드 호출 가능
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	// 3. 인스턴스 메소드에서 
	public String toString() {
		return company+" : "+name;
	}

}
