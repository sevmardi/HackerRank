package Plus_Minus;

import java.util.Scanner;

import javax.annotation.PostConstruct;

/*
 * Objective: You're given an array containing integer values. You need to print the fraction of count of positive numbers,
 *  negative numbers and zeroes to the total numbers. Print the value of the fractions correct to 3 decimal places.
 */
public class Solution 
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n= input.nextInt();
		
		int [] arr = new int[n];
		
		int positive = 0;
		int negetive = 0;
		int zero = 0;
		float frac_positive = 0, frac_negetive = 0, frac_zero = 0;
		for (int i = 0; i < n; i++) 
		{
			arr[i] = input.nextInt();
			if(arr[i] > 0)
			{
				positive++;
			}
			else if(arr[i] <0)
			{
				negetive++;
			
			}
			else
				zero++;
		}
		frac_positive = (positive/(float)n);
		frac_negetive = (negetive/(float)n);
		frac_zero = (zero/(float)n);
		System.out.printf("%.3f", frac_positive);
		System.out.println();
		System.out.printf("%.3f", frac_negetive);
		System.out.println();
		System.out.printf("%.3f", frac_zero);
	}

}
