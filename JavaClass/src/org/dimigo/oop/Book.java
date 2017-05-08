/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   |_Book
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 3. 22.
 * </pre>
 * 
 * @author : 강민
 * @version : 1.0
 */

public class Book {
	// 클래스 필드 선언
	private String title;
	private String author;
	private int page;

	// 기본 생성자
	public Book() {
		System.out.println("기본 생성자");
	}

	// 필요한 경우 다양한 생성자를 만들 수 있음
	public Book(String title, String author, int page) {
		System.out.println("매개변수 3개짜리 생성자");
		this.title = title;
		this.author = author;
		this.page = page;
	}

	public Book(String title, String author) {
		this(title, author, 100);
	}

	public Book(String title) {
		this(title, "저자미상");
	}
	
	// 클래스 메소드 선언
	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public int getPage() {
		return page;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setPage(int page) {
		if (page >= 1) {
			this.page = page;
		}
	}
	
	public String toString() {
		return "책제목 : "+title+", 저자명 : "+author+", 페이지수 : "+page;
	}
}
