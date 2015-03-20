package org.dimigo.basic;

public class Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("<< 도형 넓이 비교 >>");
		
		double a1=9, b1=10, h1=5.8;
		double a2=9, h2=5.4;
		
		double s1 = (a1+b1)*h1/2;
		double s2 = a2*h2;
		double t;
		
		System.out.println("사다리꼴의 넓이 : "+s1);
		System.out.println("평행사변형의 넙이 : "+s2);
		
		System.out.println("\n\n");
		
		String big ="사다리꼴", small ="평행사변형", temp = "";
		
		if(s1 < s2) {
			temp = big;
			big = small;
			small = temp;
			
			t = s1;
			s1 = s2;
			s2 = t;
		}
		
		System.out.println(big+"이 "+small+"보다 "+ (s1 - s2) + " 더 큽니다.");
	}
}
