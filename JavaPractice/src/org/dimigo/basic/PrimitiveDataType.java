package org.dimigo.basic;
/*
 * << 첫번째 수행평가 과제 >> 
 * 내용 : 아이유 프로필 출력하기
 *  작성일자 : 2015년 3월 13일
 *  @author student 하연
 *  @version 1.0
 */

// Java Document


public class PrimitiveDataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "아이유";
		boolean ismale = false;
		int old = 23;
		double tall = 161.8;
		float kg = 44.3f;
		char bloodtype = 'A';
		
		System.out.println("<<아이유 프로필>>");
		System.out.println("이름 : " + name);
		System.out.printf("성별 : ");
		if(ismale){
			System.out.printf("남자\n");
		}else {
			System.out.printf("여자\n");
		}
		System.out.println("나이 : " + old + "세");
		System.out.println("키 : " + tall + "cm");
		System.out.println("몸무게 : " + kg + "kg");
		System.out.println("혈액형 : " + bloodtype + "형");
	}

}


// Git : 프로그램등의 소스코드 관리를 위한 분산 버전 관리 시스템
// GitHub : Git을 사용하는 가장 인기있는 오픈 소스 코드 저장소