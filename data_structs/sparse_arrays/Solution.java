package sparse_arrays;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * 
 * @author SevMardi Objective: There are N strings. Each string's length is no
 *         more than 20 characters. There are also Q queries. For each query,
 *         you are given a string, and you need to find out how many times this
 *         string occurred previously.
 * @version 1.0
 */
public class Solution {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		List<String> strings = IntStream.range(0, in.nextInt()).mapToObj(i -> in.next()).collect(Collectors.toList());
		IntStream.range(0, in.nextInt()).mapToObj(i -> in.next())
				.mapToLong(q -> strings.stream().filter(q::equals).count()).forEach(System.out::println);

	}

}
