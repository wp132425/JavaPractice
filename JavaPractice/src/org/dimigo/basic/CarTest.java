/**
 * 
 */
package org.dimigo.basic;

/**
 * <pre>
 * org.dimigo.basic
 *	 |_ org.dimigo.basic

 * 1: 개요 : 차 클래스 연습
 * 2: 작성일 : 2015. 4. 13.
 * </pre>
 *
 * @author : 2425 윤하연
 * @version : 1.0
 */
public class CarTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Car car = new Car();
		Car car2 = new Car();
		
		System.out.println("<< 자동차 목록 >>");
		System.out.println("제조사명 : " + car.getCompany());
		System.out.println("모델명 : " + car.getModel());
		System.out.println("색상 : " + car.getColor());
		System.out.println("최대속도: "+ car.getMaxSpeed() +"km");
		System.out.println("가격 : "+ String.format("%,d",car.getPricce()) +"원\n\n");
		
		car2.setColor("흰색");
		car2.setCompany("기아자동차");
		car2.setMaxSpeed(246);
		car2.setModel("K7");
		car2.setPrice(40000000);
		
		System.out.println("제조사명 : " + car2.getCompany());
		System.out.println("모델명 : " + car2.getModel());
		System.out.println("색상 : " + car2.getColor());
		System.out.println("최대속도: "+ car2.getMaxSpeed() +"km");
		System.out.println("가격 : "+ String.format("%,d",car2.getPricce()) +"원");
	
	}

}
