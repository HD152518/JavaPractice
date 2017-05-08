/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   |_CalculatorTest
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 4. 12.
 * </pre>
 * 
 * @author : 강민
 * @version : 1.0
 */
public class CalculatorTest {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 10;
		int num2= 20;
		Calculator cal = new Calculator(num1, num2);
		
		cal.powerOn();
		System.out.println(""+num1+" + "+num2+" = "+cal.add());
		System.out.println(""+num1+" + "+num2+" = "+cal.sub());
		System.out.println(""+num1+" + "+num2+" = "+cal.mul());
		System.out.println(""+num1+" + "+num2+" = "+cal.div());
		cal.powerOff();
	}

}
