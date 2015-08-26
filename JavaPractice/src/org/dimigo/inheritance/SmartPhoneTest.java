/**
 * 
 */
package org.dimigo.inheritance;

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
public class SmartPhoneTest {
	public static void main (String args[]){
		SmartPhone I = new IPhone("iPhone 6", "애플", 700000);
		SmartPhone G = new Galaxy("갤럭시 S6", "삼성", 650000);

		if(I instanceof IPhone){
			System.out.println(I.toString());
			I.turnOn();
			I.pay();
			I.useSpecialFunction(I);
			I.turnOff();
		}
		
		System.out.println("");
		
		if(G instanceof Galaxy){
			System.out.println(G.toString());
			G.turnOn();
			G.pay();
			G.useSpecialFunction(G);
			G.turnOff();
		}
	}
}
