package cake_candles;

import java.util.Scanner;

public class Solution {

	
	public static void main(String[] args) {
		
		System.out.printf("your input please: ");
		Scanner input = new Scanner(System.in);
		
		
		int age = input.nextInt();
		
		int[] height = new int[age];
		
		for(int i = 0; i < age;i++)
		{
			height[i] = input.nextInt();
		}
		
	
		int res = birthdayCakeCandles(age, height);
		
		
		

		System.out.println(res);
		
		
		
		
		
		
	}
	
	public static int  birthdayCakeCandles(int n, int[] ar) {
	
		int count =  0;
		int tallest = ar[0];
		
		for (int i = 0; i < n; i++) {
			
			if (ar[i] > tallest)
			{
				tallest=ar[i];
			}
		}
		
		for(int i =0; i< n; i++ )
		{
			if (ar[i]== tallest) {
				count++;
				
			}
			
			
		}
		
		return count;
		
		
	}
	
}
