/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.oop
 *   |_Question
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 3. 31.
 * </pre>
 * 
 * @author : 강민
 * @version : 1.0
 */
public class Question {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] questions = { "가장 좋아하는 가수는? ", "가장 좋아하는 배우는? ", "가장 좋아하는 과목은? " };
		String[] answers = { "빅뱅", "공유", "응용 프로그래밍" };

		for (int i = 0; i < 3; i++) {
			System.out.println(""+(i+1)+"."+questions[i]);
			String myAnswer = sc.nextLine();
			
			if(myAnswer.equals(answers[i]))
				System.out.println("정답입니다!");
			else
				System.out.println("틀렸습니다!");
		}
		
		System.out.println("<< 결과 출력 >>");
		
		for(int i=0;i<3;i++)
			System.out.println(
					new StringBuilder(questions[i]).append(answers[i]).append("입니다.").toString());
	}
}
