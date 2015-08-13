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
public class Figure {
	private int centerX;
	private int centerY;
	
	public Figure(int centerX, int centerY) {
		this.setCenterX(centerX);
		this.setCenterY(centerY);
	}
	
	protected double calcArea() {
		return 0.0;
	}
	

	protected void printcenter(){
		System.out.println("중심좌표 : (" + getCenterX() + ", " + getCenterY() + ")");
	}
	
	protected void moveFigure(int x, int y){
		setCenterX(getCenterX() + x);
		setCenterY(getCenterY() + y);
	}

	
	public int getCenterX() {return centerX;}
	public int getCenterY() {return centerY;}
	public void setCenterX(int centerX) {this.centerX = centerX;}
	public void setCenterY(int centerY) {this.centerY = centerY;}
}
