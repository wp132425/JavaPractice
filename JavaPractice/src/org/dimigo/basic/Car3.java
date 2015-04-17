/**
 * 
 */
package org.dimigo.basic;

/**
 * <pre>
 * org.dimigo.basic
 *	 |_ org.dimigo.basic

 * 1: 개요 : 카 업뎃
 * 2: 작성일 : 2015. 4. 14.
 * </pre>
 *
 * @author : 2425 윤하연
 * @version : 1.3
 */
public class Car3 {

	private String company = "현대자동차";
	private String model = "제네시스";
	private String color = "검정색";
	private int MaxSpeed = 225;
	private int price = 50000000;
	
	public Car3(){
		//기본 생성자
	}
	
	public Car3(String company, String model, String color, int MaxSpeed, int price){
		this.company = company;
		this.model = model;
		this.color = color;
		this.MaxSpeed = MaxSpeed;
		this.price = price;
	}
	
	public Car3(String company, String model, String color, int MaxSpeed){
		this(company, model, color, MaxSpeed, 0);
	}
	
	public Car3(String company, String model, String color){
		this(company, model, color, 0, 0);
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
