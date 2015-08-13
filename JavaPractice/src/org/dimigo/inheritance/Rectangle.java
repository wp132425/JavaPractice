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
public class Rectangle extends Figure {
	private int width;
	private int height;

	public Rectangle(int width, int height){
		super(0,0);
		this.width = width;
		this.height = height;
	}
	
	public Rectangle(int centerX, int centerY, int width, int height){
		super(centerX, centerY);
		this.width = width;
		this.height = height;
	}
	
	protected double calcArea(){
		return width*height;
	}
	
	protected void printcenter(){
		System.out.println("사각형의 중심좌표 : (" + getCenterX() + ", " + getCenterY() + ")");
	}
	
}
