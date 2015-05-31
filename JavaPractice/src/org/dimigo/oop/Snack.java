/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.basic
 *	 |_ org.dimigo.oop

 * 1: 개요 : 
 * 2: 작성일 : 2015. 5. 19.
 * </pre>
 *
 * @author : 
 * @version : 
 */
public class Snack {

	/**
	 * @param args
	 */
	
	private String name;
	private String company;
	private int price;
	private int number;
	
	public Snack(){
		
	}
	
	public Snack(String name, String company, int price, int number){
		this.name = name;
		this.company = company;
		this.price = price;
		this.number = number;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}

	
	public void printSnack(Snack s) {
		System.out.println("이름 : "+ s.name);
		System.out.println("제조사 : "+s.company);
		System.out.println("가격 : " + String.format("%,d", s.price) + "원");
		System.out.println("개수 : "+s.number +"개\n");
	}
	
	public int Calcprice(int total, int a, int b) {
		total += a*b;
		return total;
	}
	
}
