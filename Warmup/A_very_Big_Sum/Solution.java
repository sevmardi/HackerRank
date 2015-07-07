package A_very_Big_Sum;

import java.util.Scanner;

/**
 * Objective: You are given an array of integers of size N. You need to print the sum of the elements of the array.
 * @author zero-root
 *
 */
public class Solution {
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int line = input.nextInt();
		long arr[] = new long[line];
		long res = 0;
		for(int i = 0; i<line; i++)
		{
			arr[i] = input.nextLong();
			res += arr[i];
		}
		System.out.println(res);
	}

}
