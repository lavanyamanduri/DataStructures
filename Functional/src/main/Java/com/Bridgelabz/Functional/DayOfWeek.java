package com.Bridgelabz.Functional;

public class DayOfWeek {
	public static int dayWeek(int m,int d,int y) {
		
		if(m<=12 && d<=31) {
			
			//System.out.println(Day(y,m,d));
if(Day(y,m,d)==0)
{
	return 0;

}if(Day(y,m,d)==1)
{
return 1;

}
if(Day(y,m,d)==2)
{
	return 2;
}
if(Day(y,m,d)==3)
{
	return 3;

}
if(Day(y,m,d)==4)
{
	return 4;

}
if(Day(y,m,d)==5)
{
	return 5;

}
if(Day(y,m,d)==6)
{
	return 6;

}

		}
		else {
			return -1;
		}
		return -1;


	}

	public static int Day(int y,int m,int d) {
		int y0,d0,m0,x;
		
		y0 = y - (14 - m) / 12;
		x = y0 + y0	/4 - y0	/100 + y0/400;
		m0 = m + 12 * ((14 - m) / 12) - 2;
		d0 = (d + x + 31*m0	/ 12) % 7;		
		return d0;
	}

}


