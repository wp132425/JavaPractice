/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.basic
 *	 |_ org.dimigo.basic

 * 1: 개요 : 카 업뎃
 * 2: 작성일 : 2015. 4. 14.
 * </pre>
 *
 * @author : 2425 윤하연
 * @version : 1.0
 */
public class Car2 {

	private String company = "현대자동차";
	private String model = "제네시스";
	private String color = "검정색";
	private int MaxSpeed = 225;
	private int price = 50000000;
	
	public Car2(){
		//기본 생성자
	}
	
	public Car2(String nc, String nm, String nC, int nM, int np){
		company = nc;
		model = nm;
		color = nC;
		MaxSpeed = nM;
		price = np;
	}
	
	public String getCompany(){
		return company;
	}
	
	public String getModel(){
		return model;
	}
	
	public String getColor(){
		return color;
	}
	
	public int getMaxSpeed(){
		return MaxSpeed;
	}
	
	public int getPricce(){
		return price;
	}

}
