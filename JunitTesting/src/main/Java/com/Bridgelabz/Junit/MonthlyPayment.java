package com.Bridgelabz.Junit;


public class MonthlyPayment {
	
	
	public static long Month(double p,double r,double y) {
	
		double n=12*y;
		double rate=r/(12*100);
		double z=1-Math.pow((1+rate),(-n));
		//double x=Math.pow(z,-n);
		double payment= (p*rate/z);
			//System.out.printf("Enter the calculation:"+payment);
			
			long z1=Math.round(payment);
				return z1;
		
		}
	

}
