package com.Bridgelabz.Algorithms;



public class Permutation {
	// Utility function to swap two characters in a character array
		public static void swap(char[] ch, int i, int j)
		{
			char temp = ch[i];
			ch[i] = ch[j];
			ch[j] = temp;
		
		}

		// Recursive function to generate all permutations of a String
		public static int permutations(char[] c, int currentIndex)
		{
			
			if (currentIndex == c.length - 1) {
				System.out.println(String.valueOf(c));
				
			}
			
			for (int i = currentIndex; i < c.length; i++)
			{
				swap(c, currentIndex, i);
				
				permutations(c, currentIndex + 1);
				
				swap(c, currentIndex, i);
			
				
			}
		int n=1;
		for(int i=1;i<=c.length;i++) {
			n=n*i;
		}
		return n;
						
			
		}
		// generate all permutations of a String in Java
		
}
