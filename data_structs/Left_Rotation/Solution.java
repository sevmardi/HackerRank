package Left_Rotation;

import java.util.Scanner;

/**
 * 
 * @author SevMardi
 * Objective: Given an array of n integers and a number,d ,
 *  perform d left rotations on the array. Then print the updated array as a single line of space-separated integers.
 */
public class Solution {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int d = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			arr[(i+n-d)%n] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
