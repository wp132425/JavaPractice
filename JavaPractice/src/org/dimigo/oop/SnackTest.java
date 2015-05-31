/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.basic
 *	 |_ org.dimigo.oop

 * 1: 개요 : 
 * 2: 작성일 : 2015. 5. 31.
 * </pre>
 *
 * @author : 
 * @version : 
 */
public class SnackTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Snack[] s1 = new Snack[] {new Snack("새우깡","농심",1100,2), new Snack("콘칩", "크라운", 1200,1), new Snack("허니버터칩", "해태", 1500,4)};
		Snack s = new Snack();
		int t=0;
		
		for(Snack value : s1) {
			System.out.println("이름 : "+ value.getName());
			System.out.println("제조사 : "+value.getCompany());
			System.out.println("가격 : " + String.format("%,d", value.getPrice()) + "원");
			System.out.println("개수 : "+value.getNumber() +"개\n");
			t = value.Calcprice(t, value.getNumber(), value.getPrice());
		}
		
		System.out.println("합계 : "+t);
	}

}
