package com.Bridgelabz.Junit;

public class VendingMachine {
	
	public static int countCurrency(int amount) 
    { 
        int[] notes = new int[]{ 2000, 500, 200, 100, 50, 20, 10, 5, 1 }; 
        int[] noteCounter = new int[9]; 
       
        // count notes using Greedy approach 
        for (int i = 0; i < 9; i++) { 
            if (amount >= notes[i]) { 
                noteCounter[i] = (int) (amount / notes[i]); 
                amount = amount - noteCounter[i] * notes[i]; 
            } 
        } 
       int count=0;
        // Print notes 
       // System.out.println("Currency Count ->"); 
        for (int i = 0; i < 9; i++) { 
            if (noteCounter[i] != 0) { 
        //        System.out.println(notes[i] + " : "       + noteCounter[i]); 
                count++;
               // System.out.println("count="+count);
            } 
        }
		return count; 
    } 
      
   
      
}
