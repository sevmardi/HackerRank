package Diagonal_Difference;

import java.util.Scanner;

/*
 * Objective: You are given a square matrix of size N×N. Calculate the absolute difference of the sums across the two main diagonals.
 */
public class Solution 
{
	public static void main(String[] args) 
	{
		Scanner  input = new Scanner(System.in);
		int n = input.nextInt();
		int matrix [][] = new int [n+1][n+1];
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j < n; j++) {
				matrix[i][j] = input.nextInt();
			}
		}
		System.out.println(diagonalDifference(n, matrix));
	}
	
	private static int diagonalDifference(int n, int matrix[][])
	{
		int firstDiagonal = 0;
		int secondDiagonal = 0;
		int abs_differ = 0 ;
		int j = n -1;
		for (int i = 0; i < n; i++) 
		{
			firstDiagonal += matrix[i][i];
			secondDiagonal += matrix[i][i];
			j--;
		}
/*		for (int i = 1, j = n, k = 1, count = 1; count <= n; count++, i++, j--, k++)
		{
			firstDiagonal += matrix[k][k];
			secondDiagonal += matrix[i][j];
		}*/
		abs_differ = Math.abs(firstDiagonal - secondDiagonal);
		
		return abs_differ;
	}
}
