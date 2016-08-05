package divisible_sum_pairs;

import java.util.Scanner;

/**
 * 
 * @author sevmardi
 * 
 *         Objective: You are given an array of integers, and a positive
 *         integer. Find and print the number of pairs where and + is evenly
 *         divisible by .
 * 
 */

public class Solution {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int count = 0;
		int a[] = new int[n];
		
		for (int i = 0; i < n; i++) {
			int number = sc.nextInt();
			number = number  % k;
			int com = number == 0 ? k: number;
			count += a[k-com];
			a[number] +=1;
			
			
		}
		System.out.println(count);
		
		
	}
}
