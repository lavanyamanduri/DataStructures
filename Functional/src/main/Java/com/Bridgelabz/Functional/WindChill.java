package com.Bridgelabz.Functional;

public class WindChill {

	public static double wind(double t,double v) {
	    double w = 35.74 + 0.6215*t + (0.4275*t - 35.75) * Math.pow(v, 0.16);
		long c=Math.round(w);
		return c;
		}

}
