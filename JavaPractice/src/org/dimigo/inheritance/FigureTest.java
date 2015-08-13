/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.basic
 *	 |_ org.dimigo.inheritance

 * 1: 개요 : 
 * 2: 작성일 : 2015. 8. 12.
 * </pre>
 *
 * @author : 
 * @version : 
 */
public class FigureTest {

		public static void main (String args[]){
			Circle c = new Circle(5);
			Triangle t = new Triangle(10,10,5,8);
			Rectangle r = new Rectangle(20,20,5,8);
			
			System.out.println("원의 넓이 : "+ c.calcArea());
			System.out.println("삼각형의 넓이 : "+ t.calcArea());
			System.out.println("사각형의 넓이 : "+ r.calcArea());
			
			System.out.println();
			
			c.printcenter();
			t.printcenter();
			r.printcenter();
			
			System.out.println();
			System.out.println("--중심좌뵤 이동 (x, y 축 5 씩)");
			System.out.println();
			
			c.moveFigure(5, 5);
			t.moveFigure(5, 5);
			r.moveFigure(5, 5);
			

			System.out.println();
			
			c.printcenter();
			t.printcenter();
			r.printcenter();
			
		}
}
