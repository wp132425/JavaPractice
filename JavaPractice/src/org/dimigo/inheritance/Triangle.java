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
public class Triangle extends Figure {
	private int width;
	private int height;
	
	public Triangle(int width, int height) {
		super(0,0);
		this.width = width;
		this.height = height;
	}
	
	public Triangle(int centerX, int centerY, int width, int height){
		super(centerX, centerY);
		this.width = width;
		this.height = height;
	}
	
	protected double calcArea(){
		return width * height/2;
	}
	
	protected void printcenter(){
		System.out.println("삼각형의 중심좌표 : (" + getCenterX() + ", " + getCenterY() + ")");
	}
}
