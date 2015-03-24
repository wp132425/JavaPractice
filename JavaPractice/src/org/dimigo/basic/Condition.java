package org.dimigo.basic;

public class Condition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("<< 고속도로 통행료 계산 >>");
		
		String trans="그 외";
		int fee = 0;
		int dis = 25;
		
		switch(trans){
		case "고속버스" :
			if(dis<=10){
				fee = 850;
			}else if (dis <=20){
				fee = 1150;
			}else if(dis <= 30){
				fee = 1450;
			}else {
				fee = 1450 + (dis/10)*300;
			}
			break;
		case "경차" :
			if(dis<=10){
				fee = 300;
			}else if (dis <= 20){
				fee = 500;
			}else if(dis <= 30){
				fee = 700;
			}else {
				fee = 700 + (dis/10)*200;
			}
			break;
		case "그 외" :
			if(dis<=10){
				fee = 600;
			}else {
				fee = 600 + (dis/10)*200;
			}
			break;
		default :
		}
		
		System.out.println("거리 : " + dis +"km");
		System.out.println("차종 : "+trans);
		System.out.println("통행료 : "+fee+"원");
	}

}
