package Arrays_DS;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int[] arr = new int[N];

		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		for (int j = N - 1; j >= 0; j--) {
			System.out.println(arr[j] + " ");
		}

	}
}