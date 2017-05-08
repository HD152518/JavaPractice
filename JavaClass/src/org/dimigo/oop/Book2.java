/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   |_Book2
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 3. 28.
 * </pre>
 * 
 * @author : 강민
 * @version : 1.0
 */
public class Book2 {
	private String title;
	private String author;
	private int page;
	
	public Book2(String title, String author, int page) {
		this.title = title;
		this.author = author;
		this.page = page;
	}
	
	public String getTitle() {
		return title;
	}
	void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	
	
}
