/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   |_BookTest
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 3. 22.
 * </pre>
 * 
 * @author : 강민
 * @version : 1.0
 */

public class BookTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// new 연산자로 객체를 생성
		// 생성된 객체의 주소를 리턴함
		Book book = new Book("Word Master", "이투스", 1000);
	
		// Ref 변수를 이용해서 객체에 접근하기
		System.out.println(book.getTitle());
		System.out.println(book.getAuthor());
		;
		System.out.println(book.getPage());

		// 두번째 Book 객체 : book2
		Book book2 = new Book("중국어1", "정지훈");

//		book2.setTitle("이것이 자바다");
//		book2.setAuthor("나자바");
//		book2.setPage(2000);
		
		// Ref 변수를 이용해서 객체에 접근하기
		System.out.println(book2.getTitle());
		System.out.println(book2.getAuthor());
		System.out.println(book2.getPage());

		Book book3 = new Book();
	}
}