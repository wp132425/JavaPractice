/**
 * 
 */
package org.dimgo.Thread;

/**
 * <pre>
 * org.dimigo.basic
 *	 |_ org.dimgo.Thread

 * 1: 개요 : 
 * 2: 작성일 : 2015. 11. 4.
 * </pre>
 *
 * @author : 
 * @version : 
 */
public class Race {
	public static void main(String args[]) {
		System.out.println("main thread start");
		
		Thread r1 = new Runner("욱재");
		Thread r2 = new Runner("어진");
		
		r1.setPriority(Thread.MAX_PRIORITY);
		r2.setPriority(Thread.MIN_PRIORITY);
		
		r1.start();
		r2.start();
		
		System.out.println("main thread end");
	}
}
