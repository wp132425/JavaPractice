/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.basic
 *	 |_ org.dimigo.oop

 * 1: 개요 : 점수
 * 2: 작성일 : 2015. 5. 18.
 * </pre>
 *
 * @author : 2425 윤하연
 * @version : 
 */
public class Score {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.println("국어 점수 입력=> ");
		int kor = s.nextInt();
		System.out.println("수학 점수 입력=> ");
		int mat = s.nextInt();
		System.out.println("영어 점수 입력=> ");
		int eng = s.nextInt();
		
		int all = kor + mat + eng;
		
		
		System.out.println("\n\n<<점수 출력>>");
		System.out.println(new StringBuilder("국어점수 : ").append(kor).append("점\n").append("수학점수 : ").append(mat).append("점\n").append("영어점수 : ").append(eng).append("점\n").append("총점 : ").append(all).append("점\n").append("평균 : ").append(String.format("%.1f", (double)all / (double)3)).append("점\n"));
	}

}
