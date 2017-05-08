/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   |_StringTest2
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 3. 31.
 * </pre>
 * 
 * @author : 강민
 * @version : 1.0
 */
public class StringTest2 {

	public static void main(String[] args) {
		// 1. String으로 문자열 추가하기
		String str = "디미고 ";
		str += "2학년 ";
		str += "5반 ";
		str += "1번 ";
		str += "나자바 ";
		System.out.println(str);
		
		// 2. StringBuilder로 문자열 추가하기
		StringBuilder sb = new StringBuilder("디미고 ");
//		sb.append("2학년 ");
//		sb.append("5반 ");
//		sb.append("1번 ");
//		sb.append("나자바 ");
		// 메소드 Chaining
		sb.append("2학년 ").append("5반 ").append("1번 ").append("나자바 ");
		
		System.out.println(sb.toString());
		System.out.println(sb);
		
		// toString()가 구현되어있으면 
		// 
		Book book = new Book("미생", "윤태호", 1000);
		System.out.println(book);
		
		//속도 비교 메소드
		new StringTest2().compareSpeed();
	}
	
	private void compareSpeed() {
		long start = System.currentTimeMillis();
		
		String test = "abc"; //15초
		StringBuilder sb = new StringBuilder("abc"); //0.02~0.03초
		
		for(int i=0; i<1000000; i++) {
//			test+="def";
			sb.append("def");
		}

		long end = System.currentTimeMillis();
		System.out.println(end - start);
	}
}
