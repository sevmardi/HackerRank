package cut_the_sticks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		ArrayList<Integer> array = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			int a = scan.nextInt();
			array.add(a);
		}
//		System.out.println(array.size());
		Collections.sort(array);
		for (int i = 0; i < array.size(); i++) {
			if (array.get(0) == 0) {
				array.remove(0);
				i = -1;
				continue;

			}
			System.out.println(array.size());
			int min = array.get(0);
			for (int j = 0; j < array.size(); j++) {
				array.set(j, array.get(j) - min);
			}
		}
	}
}
