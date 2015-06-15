/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.basic
 *	 |_ org.dimigo.oop

 * 1: 개요 : 
 * 2: 작성일 : 2015. 6. 15.
 * </pre>
 *
 * @author : 
 * @version : 
 */
public class FamilyMember {

	private static int memberCnt=0;
	private String memberName;
	
	public FamilyMember(String MemberName) {
		this.memberName = MemberName;
		memberCnt++;
	}

	public String getMemberName() {
		return memberName;
	}
	
	public void printMemberCnt(){
		System.out.println("가족 총 인원 수 : " + memberCnt + "명");
	}
	
}
