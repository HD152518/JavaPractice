/**
 * 
 */
package org.dimigo.basic;

import java.util.Random;
import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.basic
 *   |_Loop
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 3. 16.
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
		Scanner keyboard = new Scanner(System.in);
		Random rand = new Random();
		int choice;
		int attack = 100;
		String[] job = { "마법사", "영주", "기사", "농민" };

		while (true) {
			System.out.println("-------------------------");
			System.out.println("<< 게임 메뉴 >>");
			System.out.println("1. 공격력 증가");
			System.out.println("2. 공격력 감소");
			System.out.println("3. 캐릭터 설정");
			System.out.println("9. 종료");
			System.out.println("-------------------------");
			System.out.print("메뉴 입력 =>");
			choice = keyboard.nextInt();

			switch (choice) {
			case 1:
				attack += 10;
				System.out.println("공격력이 증가되었습니다. 현재 공격력 : " + attack);
				break;
			case 2:
				attack -= 10;
				System.out.println("공격력이 감소되었습니다. 현재 공격력 : " + attack);
				break;
			case 3:
				System.out.println(job[rand.nextInt(4)] + "(으)로 설정되어습니다.");
				break;
			case 9:
				System.out.println("이제 공부하세요!");
				return;
			default:
				System.out.println("없는 메뉴입니다!!");
				break;
			}
		}
	}
}
