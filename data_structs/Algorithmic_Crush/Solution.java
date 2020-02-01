package Algorithmic_Crush;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {

		int N, M, a, b;
		long k; // int k

		Scanner s = new Scanner(System.in);

		N = s.nextInt();
		M = s.nextInt();
		long[] diffArray = new long[N + 1]; // int[]

		for (int i = 0; i < M; i++) {
			s.nextLine();
			// for every operation you are given three values
			a = s.nextInt();
			b = s.nextInt();
			k = s.nextLong();
			
			//add value k to all elems and b
			diffArray[a] += k;
			
			if (b + 1 <= N) {
				diffArray[b + 1] -= k;
			}
		}
		
		long max = 0, addDiff = 0;
		for (int i = 0; i <= N; i++) {
			addDiff += diffArray[i];
			if (max < addDiff) {
				max = addDiff;
			}

		}
		System.out.println(max);
		s.close();

	}

}
