package kangaroo;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int x1 = in.nextInt();
		int v1 = in.nextInt();
		int x2 = in.nextInt();
		int v2 = in.nextInt();
		int intersection = 0;

		for (int testCase = 0; testCase < 1; testCase++) {
			if (v1 != v2) {
				if ((x2 - x1) % (v1 - v2) != 0) {
					intersection = -1;
				} else {
					intersection = (x2 - x1) / (v1 - v2);
				}
			} else {
				if (x2 == x1) {
					intersection = 1;
				} else {
					intersection = -1;
				}
			}
			if (intersection >= 0) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}

		}

	}
}
