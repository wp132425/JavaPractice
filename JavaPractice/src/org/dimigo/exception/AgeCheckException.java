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
public class AgeCheckException extends Exception{
	public AgeCheckException(){
		
	}
	
	public AgeCheckException(Movie movie){
		super(String.format("%s은/는 %d세 관람가 입니다", movie.getTitle(), movie.getLimitAge()));
	}
}
