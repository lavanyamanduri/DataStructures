package com.Bridgelabz.Algorithms;



public class Prime {
	
	public static boolean prime(int a,int b,int n) {
	
			int flag=0;
			for(int i = a; i <= b; i++)
	        {
	            for( int j = 2; j < i; j++)
	            {
	                if(i % j == 0)
	                	
	                {
	                	if((n%2==0 ||n%3==0) && (n>a && n<b))
	                	
	                			return true;
	                
	                		flag = 0;
	                		break;
	                }
	                else
	                {
	                    flag = 1;
	                }
	            }
	            if(flag == 1)
	            { 

	             //  System.out.println(i);
	             //  return true;
	            }
	        }
			return true;
		}

}
