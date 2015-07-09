package Staircase;

import java.util.Scanner;

public class Solution_v02 {
	 public static void main(String[] args) {
	        // Input //
	        Scanner sc = new Scanner(System.in);
	        int t = sc.nextInt();
	        String step="";
	        String space=" ";
	        // Output //
	        for (int i = 0; i < t; i++) {
	            for (int j = t - i -2; j >= 0 ; j--) {
	                System.out.print(space);
	            }
	            step += "#";
	            System.out.print(step);
	            System.out.println();
	        }
	    }
	 
	 
	 
}
