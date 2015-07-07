package Utopian_Tree;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int notOfCycles = input.nextInt();
		
		for(int i=1;i<=notOfCycles; i++)
		{
			int noOfCycles = input.nextInt();
			   System.out.println(UtopianHeight(noOfCycles));
		}
		input.close();
		
	}
	
	private static int UtopianHeight(int notOfCycles)
	{
		int height = 1;
		if(notOfCycles <=0)
		{
			return 1;
		}
		for(int i =1;i<=notOfCycles; i++)
		{
			if(i%2!=0)
			{
				height = 2 * height;
			
			}
			else
				height += 1;
		}
		return height;
		
	}
	
}
