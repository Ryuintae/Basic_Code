package Array;

import java.util.Arrays;
import java.util.Collections;

public class Sort {
	public static void main(String[] args) {
		int[] num = { 15, 13, 4, 2, 1, 6, 7, };
		Arrays.sort(num); // 오름차순
		System.out.println(Arrays.toString(num));
		System.out.println("=======================");

		int[] num1 = { 15, 13, 4, 2, 1, 6, 7, };

		Integer[] arr2 = Arrays.stream(num1).boxed().toArray(Integer[]::new);
		Arrays.sort(arr2, Collections.reverseOrder());
		System.out.println(Arrays.toString(arr2));

	}
}
