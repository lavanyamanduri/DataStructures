package com.Bridgelabz.Basic;

public class LeapYear {

	public static int leap(int n) {
		int count=0;
	
		int t;t=n;
		
		while(n!=0) {
			n/=10;
			count++;
		}
		if(count==4) {
			if((n%400==0) &&(n%100==0) && (n%4==0)) {
				//System.out.println("Leap "+t);
				return t;
					
		}
			else {
				return 0;
			}
		}
		
		return t;
	}
}
