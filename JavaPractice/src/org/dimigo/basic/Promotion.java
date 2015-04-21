package org.dimigo.basic;
/*
 * << 두번째 수행평가 과제 >> 
 * 내용 : 디미베네 연간 인건비
 *  작성일자 : 2015년 3월 17일
 *  @author student 하연
 *  @version 1.0
 */


public class Promotion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arg = 1700000;
		int peo = 3;
		int shop = 1500;
		
		System.out.println("<<디미베네 연간 인건비>>");
		System.out.printf("월 평균 급여 : " + String.format("%,d", arg) + "원\n");
		System.out.printf("점포 내 직원 수 : %d명\n", peo);
		System.out.printf("점포 수 : " + String.format("%,d", shop) + "개\n");
		System.out.printf("\n\n\n");
		System.out.printf("연간 인건비 : " + String.format("%,d", (long)arg * 12 * peo * shop));
	}

}