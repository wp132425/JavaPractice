package org.dimigo.oop;

import org.dimigo.basic.Car3;

/**
 * <pre>
 * org.dimigo.oop
 *	 |_ org.dimigo.oop

 * 1: 개요 : 차 클래스 연습
 * 2: 작성일 : 2015. 4. 13.
 * </pre>
 *
 * @author : 2425 윤하연
 * @version : 1.3
 */
public class CarTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Car3 car = new Car3("현대자동차", "제네시스", "검정색", 225, 50000000);
		Car3 car2 = new Car3("기아자동차", "K7", "흰색", 246);
		Car3 car3 = new Car3("삼성자동차", "SM7", "회색");
		
		System.out.println("<< 자동차 목록 >>");
		System.out.println("제조사명 : " + car.getCompany());
		System.out.println("모델명 : " + car.getModel());
		System.out.println("색상 : " + car.getColor());
		System.out.println("최대속도: "+ car.getMaxSpeed() +"km");
		System.out.println("가격 : "+ String.format("%,d",car.getPricce()) +"원\n\n");
		
		/*		
 		car2.setColor("흰색");
		car2.setCompany("기아자동차");
		car2.setMaxSpeed(246);
		car2.setModel("K7");
		car2.setPrice(40000000);
		*/
		
		System.out.println("제조사명 : " + car2.getCompany());
		System.out.println("모델명 : " + car2.getModel());
		System.out.println("색상 : " + car2.getColor());
		System.out.println("최대속도: "+ car2.getMaxSpeed() +"km");
		System.out.println("가격 : "+ String.format("%,d",car2.getPricce()) +"원\n\n");
	
		System.out.println("제조사명 : " + car3.getCompany());
		System.out.println("모델명 : " + car3.getModel());
		System.out.println("색상 : " + car3.getColor());
		System.out.println("최대속도: "+ car3.getMaxSpeed() +"km");
		System.out.println("가격 : "+ String.format("%,d",car3.getPricce()) +"원\n\n");
	}

}
