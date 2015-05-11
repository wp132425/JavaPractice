/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.basic
 *	 |_ org.dimigo.oop

 * 1: 개요 : 문자열
 * 2: 작성일 : 2015. 5. 11.
 * </pre>
 *
 * @author : 
 * @version : 
 */
public class Question {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("하연이가 제일 좋아하는 동물은 무엇입니까\n");
		Scanner s = new Scanner(System.in);
		String answer = s.nextLine();
		String col =  "뱀";
		if(col.equals(answer)){
			System.out.println("정답입니다.");
		}else {
			System.out.println("오답입니다.");
		}
		
		System.out.println("하연이는 어느 행성사람입니까\n");
		String answer2 = s.nextLine();
		col =  "지구";
		if(col.equals(answer2)){
			System.out.println("정답입니다.");
		}else {
			System.out.println("오답입니다.");
		}
		
		System.out.println("하연이는 똑똑합니까\n");
		String answer3 = s.nextLine();
		col =  "네";
		if(col.equals(answer3)){
			System.out.println("정답입니다.");
		}else {
			System.out.println("오답입니다.");
		}
	}

}
