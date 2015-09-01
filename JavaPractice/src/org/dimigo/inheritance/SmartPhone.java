/**
 * 
 */
package org.dimigo.inheritance;

import java.text.Format;

/**
 * <pre>
 * org.dimigo.basic
 *	 |_ org.dimigo.inheritance

 * 1: 개요 : 
 * 2: 작성일 : 2015. 8. 25.
 * </pre>
 *
 * @author : 
 * @version : 
 */
public abstract class SmartPhone {
	private String model;
	private String company;
	private int price;
	
	public SmartPhone(){
		
	}
	
	public SmartPhone(String model, String company, int price){
		this.model = model;
		this.company = company;
		this.price = price;
	}
	
	public void turnOn(){
		System.out.println(model + "의 전원을 켭니다.");
	}
	
	
	public void turnOff(){
		System.out.println(model + "의 전원을 끕니다.");
	}
	
	public abstract void pay();
	
	public void useSpecialFunction(SmartPhone phone){
		if(phone instanceof IPhone){
			IPhone IP = (IPhone) phone;
			IP.useAirDrop();
		}
		if(phone instanceof Galaxy){
			Galaxy GX = (Galaxy) phone;
			GX.useWirelessCharging();
		}
	}
	
	public String toString(){
		return "모델명 : " + model + ", 제조사 : " + company + ", 가격 : " + String.format("%,d",price) + "원";
	}

}
