/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *	 |_ org.dimigo.oop

 * 1: 개요 : 차 클래스 연습
 * 2: 작성일 : 2015. 4. 13.
 * </pre>
 *
 * @author : 2425 윤하연
 * @version : 1.0
 */
public class Car {

	private String company = "현대자동차";
	private String model = "제네시스";
	private String color = "검정색";
	private int MaxSpeed = 225;
	private int price = 50000000;
	
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
	
	public void setCompany(String newcompany){
		company = newcompany;
	}
	
	public void setModel(String newmodel){
		model = newmodel;
	}
	
	public void setColor(String newcolor){
		color = newcolor;
	}
	
	public void setMaxSpeed(int newMaxSpeed){
		MaxSpeed = newMaxSpeed;
	}
	
	public void setPrice(int newPrice){
		price = newPrice;
	}
}
