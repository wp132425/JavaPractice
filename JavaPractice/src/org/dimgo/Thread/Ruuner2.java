/**
 * 
 */
package org.dimgo.Thread;

import java.util.Random;

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
public class Ruuner2 implements Runnable {
	String name;
	
	public Ruuner2 () {
	}
	
	public Ruuner2 (String name) {
		this.name = name;
	}
	
	public void run(){
		int meter = 100;
		System.out.println(name + "출발");
		
		while(meter>=0){
			try {
				
					Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println(name + meter +  "미터");
			meter -= 10;
			if(meter == 0){
				System.out.println(name + "골인!!");
			}
		}
	}
}
