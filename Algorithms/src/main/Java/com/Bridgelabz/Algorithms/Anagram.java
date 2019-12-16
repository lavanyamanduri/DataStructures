package com.Bridgelabz.Algorithms;

import java.util.Arrays;


public class Anagram {

	 
	    public static boolean checkAnagram(String s1, String s2)
	    {
	        // Remove all the white space
	        s1 = s1.replaceAll("\\s", "");
	        s2 = s2.replaceAll("\\s", "");
	        
	        // Check if both length matches
	        if(s1.length() != s2.length())
	            return false;
	        else
	        {
	            // Convert both Strings into lower case and into Character Array
	            char[] arr1 = s1.toLowerCase().toCharArray();
	            char[] arr2 = s2.toLowerCase().toCharArray();
	            
	            // Sort both Character Array
	            Arrays.sort(arr1);
	            Arrays.sort(arr2);
	            
	            // Check if both arrays are equal
	            return (Arrays.equals(arr1, arr2));
	            
	        }
	    }
}
