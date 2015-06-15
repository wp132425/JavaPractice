/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.basic
 *	 |_ org.dimigo.oop

 * 1: 개요 : 
 * 2: 작성일 : 2015. 6. 15.
 * </pre>
 *
 * @author : 
 * @version : 
 */
public class PiggyBank {
	
	private static int balance=0;
	
	public static void putMoney(FamilyMember member, int amount ){
			System.out.println(member.getMemberName() + " " + amount + "원 넣음");
			balance += amount;
	}
	
	public static void printBalance(){
		System.out.println("돼지 저금통 총 금액 : " + balance + "원");
	}
}
