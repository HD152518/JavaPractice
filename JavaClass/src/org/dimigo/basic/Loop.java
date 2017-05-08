/**
 * 
 */
package org.dimigo.basic;

import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.basic
 *   |_Loop
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 3. 15.
 * </pre>
 * 
 * @author : 강민
 * @version : 1.0
 */
public class Loop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j < 9; j++) {
				System.out.println(i + " * " + j + " = " + i * j);
			}
			System.out.println();
		}

		// .2. for-each문
		int[] arr = { 1, 2, 3, 4, 5 };
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		for (int i : arr) {
			System.out.println(i);
		}

		// 트와이스 멤버 출력
		String[] twice = { "정연", "쯔위", "다현", "모모" };

		for (String i : twice) {
			System.out.println(i);
		}
		
		// 3. while, do-while문
		//메뉴 처리
		Scanner sc = new Scanner(System.in);
		int choice;
		
		do {
			System.out.println("<< 메뉴 선택 >>");
			System.out.println("1. 간장치킨");
			System.out.println("2. 양념치킨");
			System.out.println("9. 종료");
			System.out.println("=== 당신의 선택은? ");
			
			choice = sc.nextInt();
			
			switch(choice){
			case 1:
				System.out.println("HP가 10 회복되었다.");
				break;
			case 2:
				System.out.println("MP가 10 회복되었다.");
				break;
			case 9:
				System.out.println("끝");
				sc.close();
				break;
			default:
				System.out.println("?");
			}
		}while(choice!=9);
		
	}

}
