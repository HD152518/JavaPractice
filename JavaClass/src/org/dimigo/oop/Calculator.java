/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   |_Calculator
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 4. 12.
 * </pre>
 * 
 * @author : 강민
 * @version : 1.0
 */
public class Calculator {
	/************* 정적 필드 **************/
	private int num1;
	private int num2;
	private boolean powerFlag; 
	
	/************ 정적 메소드 **************/
	
	public Calculator(){
		powerFlag = false;
	}
	
	public Calculator(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public void powerOn() {
		if(!this.powerFlag) {
			System.out.println("전원을 켭니다.");
			this.powerFlag = true;
		}
	}
	
	public void powerOff() {
		if(this.powerFlag) {
			System.out.println("전원을 끕니다.");
			this.powerFlag = false;
		}
	}
	
	public int add() {
		this.powerOn();
		return this.num1+this.num2;
	}
	
	public int sub() {
		this.powerOn();
		return this.num1-this.num2;
	}
	
	public int mul() {
		this.powerOn();
		return this.num1*this.num2;
	}
	
	public double div() {
		this.powerOn();
		return (double)num1/num2;
	}
}
