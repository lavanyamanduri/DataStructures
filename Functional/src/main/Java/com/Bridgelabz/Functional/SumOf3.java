package com.Bridgelabz.Functional;

public class SumOf3 {
	

		public static boolean sum(int[] a) {
			for(int i=0;i<a.length;i++) {
				for(int j=i+1;j<a.length;j++) {
					for(int k=j+1;k<a.length;k++) {
						if(a[i]+a[j]+a[k]==0) {
							return true;
							//	System.out.println("Sum  is zero :"+a[i]+" "+a[j]+" "+a[k]);
						}
									
					}
				}
			}
		
			return false;
	}
	
}
