package com.Bridgelabz.Algorithms;

public class Insertion {


public static String insert(String[] str,int n) {
	       	        String temp = null;
	       	       
	       	        int j;
	        //Sorting the strings
	        for (int i = 0; i < n-1; i++) 
	        {
	            temp=str[i];
	            for( j=i;j>0 && (temp.compareTo( str[j-1])<0);j--) {
	            	str[j]=str[j-1];
	            	str[j]=temp;
	            }
	      //      str[j]=temp;
	        }
	        
	     //   System.out.print("Strings in Sorted Order:");
	        for (int i = 0; i <n; i++) //n-1
	        {
	            System.out.print(str[i] + " ");
	        }
			return temp;
	    }
}
