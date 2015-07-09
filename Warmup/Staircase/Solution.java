package Staircase;

import java.util.Scanner;

/*
 * Objective: Your teacher has given you the task to draw the structure of a staircase. 
 * Being an expert programmer, you decided to make a program for the same. 
 * You are given the height of the staircase. You need to print a staircase as shown in the example.
 */
public class Solution 
{
	public static void main(String[] args) 
	{
		
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		//int[] arr = new int[n];
		
		for (int i = 1; i <= n; i++)
		{
			int space = i;
			while(space <= n-1)
			{
				System.out.println(" ");
				space++;
			}
			int stairs = i;
			while(stairs> 0)
			{
				System.out.println("#");
				stairs--;
			}
			System.out.println();
		}
	}

	
	
	
}
