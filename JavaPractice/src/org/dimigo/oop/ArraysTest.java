/**
 * 
 */
package org.dimigo.oop;

import java.util.Arrays;

/**
 * <pre>
 * org.dimigo.oop
 *   |_ArraysTest
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 4. 11.
 * </pre>
 * 
 * @author : 강민
 * @version : 1.0
 */
public class ArraysTest {

	public static void main(String[] args) {
		
		String[] src = {"TWICE", "레드벨벳", "주현도", "주동명", "권두영", "Apple"};
		System.out.println(Arrays.toString(src));
		
		String[] dest = Arrays.copyOf(src, src.length);
		System.out.println(Arrays.toString(dest));
		System.out.println(dest == src);
		System.out.println(Arrays.equals(src, dest));
		
		Arrays.sort(src);
		System.out.println(Arrays.toString(src));
		
		int index = Arrays.binarySearch(src, "TWICE");
		System.out.println(index);
		
		String num1 = args[0];
		String num2 = args[1];
		
		int a = Integer.parseInt(num1);
		int b = Integer.parseInt(num2);
		
		System.out.println(a+b);
	}
}
