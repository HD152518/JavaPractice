/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   |_ArrayBasic
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 4. 4.
 * </pre>
 * 
 * @author : 강민
 * @version : 1.0
 */
public class ArrayBasic {

	public static void main(String[] args) {
		// int 타입 배열 선언
		int[] intArr = null;

		// int 타입 배열 생성
		intArr = new int[5];

		ArrayBasic obj = new ArrayBasic();
		obj.printArray(intArr);

		// 배열 선언 시 초기화하기
		// int[] intArr2 = { 1, 2, 3, 4, 5 };
		// int[] intArr2 = new int[] { 1, 2, 3, 4, 5 };
		int[] intArr2 = null;
		intArr2 = new int[] { 1, 2, 3, 4, 5 };

		obj.printArray(intArr2);

		// String 타입 배열
		String[] strArr = new String[3];
		obj.printArray(strArr);

		strArr[0] = "EXO";
		strArr[1] = "트와이스";
		obj.printArray(strArr);

		String[] strArr2 = new String[] { "EXO", "트와이스", "레드벨벳" };
		obj.printArray(strArr2);

		// Book 타입 배열
		Book[] bookArr = new Book[2];
		bookArr[0] = new Book("미생", "윤태호", 1000);
		bookArr[1] = new Book("자바의 신", "나자바", 500);

		obj.printArray(bookArr);

		// bookArr2라는 베열을 만들고, 바로 초기화하기
		Book[] bookArr2 = /* new Book[] */ { new Book("미생2", "윤태호", 1000), new Book("자바의 신2", "나자바", 500) };
		obj.printArray(bookArr2);

		// 배열 사용 시 주의사항
		int[] intArr3 = null;
		// System.out.println(intArr3.length);

		intArr3 = new int[3];
		System.out.println(intArr[intArr3.length - 1]);

		String[] strArr3 = new String[3];
		// System.out.println(strArr3[0].length());

		int[] intArr4 = { 1, 2, 3, 4, 5 };
		// int[] intArr4 = null;
		// int[] intArr4 = {1,2,3,4,5};
		obj.printArray(intArr4);
		int[] intArr5 = new int[] { 1, 2, 3, 4, 5 };
		obj.printArray(intArr5);

		Book[] bookArr3 = { new Book("미생", "윤태호", 1000), new Book("남한산성", "김훈", 500) };

		obj.printArray(bookArr3);

		int[] scores = { 100, 90, 80 };
		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			sum +=scores[i];
		}
		
		System.out.println("총합 : "+sum);
		
		
	}

	private void printArray(Book[] bookArr) {
		for (Book value : bookArr) {
			System.out.print(value + " | ");
		}
		System.out.println();
	}

	private void printArray(String[] strArr) {
		for (String value : strArr) {
			System.out.print(value + " | ");
		}
		System.out.println();
	}

	private void printArray(int[] intArr) {
		for (int value : intArr) {
			System.out.print(value + " | ");
		}
		System.out.println();
	}
}
