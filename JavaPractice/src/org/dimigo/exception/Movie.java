/**
 * 
 */
package org.dimigo.exception;

/**
 * <pre>
 * org.dimigo.basic
 *	 |_ org.dimigo.exception

 * 1: 개요 : 
 * 2: 작성일 : 2015. 9. 22.
 * </pre>
 *
 * @author : 
 * @version : 
 */
public class Movie {
	private String title;
	private int limitAge;
	
	public Movie (String title, int limitAge){
		this.title = title;
		this.limitAge = limitAge;
	}

	public String getTitle() {
		return title;
	}

	public int getLimitAge() {
		return limitAge;
	}
	
	
}
