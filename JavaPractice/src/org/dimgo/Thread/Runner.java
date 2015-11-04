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
public class Runner extends Thread {
	String name;
	
	public Runner () {
	}
	
	public Runner (String name) {
		this.name = name;
	}
	
	public void run(){
		int meter = 100;
		while(meter>=0){
			try {
				
					Thread.sleep(1000);
					System.out.println(name + meter +  "미터");
					meter -= 10;
		
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
