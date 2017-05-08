/**
 * 
 */
package org.dimigo.basic;

import java.util.Random;

/**
 * <pre>
 * org.dimigo.basic
 *   |_Condition
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 3. 15.
 * </pre>
 * 
 * @author : 강민
 * @version : 1.0
 */
public class Condition {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 1. if~else문
		// 선거권 연령 : 만 19세
		int age = 17;
		
		if(age>=19){
			System.out.println("투표하러 갑시다!!");
		} else {
			System.out.println("선거궙이 없네요!!");
		}
		
		// 2. switch문
		//주사위 랜덤값 뽑기 (1~6(
//		System.out.println(new Random().nextInt(6)+1);
		
		int num = new Random().nextInt(6)+1;
		System.out.println(num);
		
		switch(num%2){
		case 0:
			System.out.println("짝수입니다");
		case 1:
			System.out.println("홀수입니다");
		}
		
		String menu = "짬뽕";
		
		switch(menu) {
		case "짜장면":
			System.out.println("짜장면 선택");
		case "짬뽕":
		}
	}

}
