/**
 * 
 */
package org.dimigo.collection;

/**
 * <pre>
 * org.dimigo.basic
 *	 |_ org.dimigo.collection

 * 1: 개요 : 
 * 2: 작성일 : 2015. 9. 23.
 * </pre>
 *
 * @author : 
 * @version : 
 */
public class Music {
	private String title;
	private String singer;
	
	public  Music(String title, String singer){
		this.title = title;
		this.singer = singer;
	}

	public String getTitle() {
		return title;
	}

	public String getSinger() {
		return singer;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	
	
	@Override
	public String toString() {
		return "Music [title=" + title + ", singer=" + singer + "]";
	}
	
}
