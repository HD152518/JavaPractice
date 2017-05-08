/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   |_StringTest
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 3. 30.
 * </pre>
 * 
 * @author : 강민
 * @version : 1.0
 */
public class StringTest {

	public static void main(String[] args) {
		// 1. 문자열 리터럴 방식 (Literal Pool에 생성, 동일 문자열인 경우 공유
		String dog1 = "해방이";
		String dog2 = "해방이";
		System.out.println(dog1 == dog2);

		// 2. new 객체 생성 방식 (매번 다른 문자열 객체를 생성
		String cat1 = new String("나비");
		String cat2 = new String("나비");
		System.out.println(cat1 == cat2);

		// 문제
		System.out.println(dog1 == "해방이");
		System.out.println(cat1 == "나비");

		// 문자열 비교시 equals 메소드 사용하기
		System.out.println(dog1.equals(dog2));
		System.out.println(cat1.equals(cat2));

		// 문자열 비교 시 주의사항
		String id = "admin"; // 사용자가 입력한 id

		// id가 "admin"과 같으면 "관리자"를, 다르면 "일반사용자"를 출력
		System.out.println((id.equals("admin") ? "관리자" : "일반사용자"));

		// 문자열 메소드 알아보기
		new StringTest().testStringMethod();
	}

	private void testStringMethod() {
		// 01234567890123
		String s = "abcdefgABCDEFG";

		System.out.println(s.length()); 			 // 14
		System.out.println(s.substring(3));		 // defgABCDEFG
		System.out.println(s.substring(3, 6));  // def
		System.out.println("[" + "    ABC    ".trim() + "]");
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.startsWith("abc")); 	//true
		System.out.println(s.endsWith("FGH")); 	//false
	}
}
