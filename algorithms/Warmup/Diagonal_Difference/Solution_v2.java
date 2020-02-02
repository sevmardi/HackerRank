package Diagonal_Difference;

import java.io.IOException;
import java.util.Scanner;

public class Solution_v2 {

	public static void main(String[] args) throws IOException 
	{
		
		 Scanner input =new Scanner(System.in);
		int n = input.nextInt();
		int [][] matrix = new int [n][n];
		for (int i = 0; i < n; i++) 
		{
			for (int j = 0; j < n; j++)
			{
				matrix[i][j] = input.nextInt();
			}
		}
	
		int firstDiagonal = 0;
		int secondDiagonal = 0;
		int abs_differ = 0 ;
		int j = n-1;
		for (int i = 0; i < n; i++)
		{
			firstDiagonal = matrix[i][i];
			secondDiagonal  = matrix[i][j];
			j--;
		}

		abs_differ = Math.abs(firstDiagonal - secondDiagonal);
        System.out.println(abs_differ);
	}
}
