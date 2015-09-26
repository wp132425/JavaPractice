/**
 * 
 */
package org.dimigo.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * <pre>
 * org.dimigo.basic
 *	 |_ org.dimigo.collection

 * 1: 개요 : 
 * 2: 작성일 : 2015. 9. 24.
 * </pre>
 *
 * @author : 
 * @version : 
 */
public class MelonChart {
	public static void main(String[] args){
		ArrayList<Music> list = new ArrayList<Music>();
		
		
		list.add(new Music("바람이나 좀 쐐", "개리"));
		list.add(new Music("보통연애", "박경"));
		list.add(new Music("취향저격", "iKON"));
		
		System.out.println("--<<멜론차트>>--");
		printList(list);
		
		list.add(1, new Music("레옹", "이유갓지"));
		System.out.println("\n--<<2위 곡 추가>>--");
		printList(list);
		
		list.set(2, new Music("맙소사", "황태지"));
		System.out.println("\n--<<3위 곡 변경>>--");
		printList(list);
		
		list.remove(3);
		System.out.println("\n--<<4위 곡 삭제>>--");
		printList(list);
		
		list.clear();
		System.out.println("\n--<<전체 리스트 삭제>>--");
		printList(list);		
		
	}
	
	public static void printList(List<Music> list){
		int i=1;
		for(Music value: list){
			System.out.println(i+"."+value);
			i++;
		}		
	}
}
