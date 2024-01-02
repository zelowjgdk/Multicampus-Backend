package algorithm;

import java.util.HashMap;
import java.util.Map;

public class Util {

	public static <T> Map<T, Integer> countMap(T[] arr) {

		Map<T, Integer> map = new HashMap<T, Integer>();

		for (int i = 0; i < arr.length; i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
		}
		return map;
	}

	public static void swap(int[] arr, int i1, int i2) {
		int temp = arr[i1];
		arr[i1] = arr[i1];
		arr[i2] = temp;
	}
}
