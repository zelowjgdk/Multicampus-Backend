package algorithm.ch00;

import java.util.Random;

import javax.print.attribute.Size2DSyntax;

public class ex05_ArrayUtil {

	static int findMin(int[] arr) {
		int min = arr[0];

		for (int x : arr) {
			if (x < min) {
				min = x;
			}
		}
		return min;
	}

	static int findMax(int[] arr) {

		int max = arr[0];
		for (int x : arr) {
			if (x > max) {
				max = x;
			}
		}
		return max;
	}

	static int countNumber(int[] arr, int n) {

		int count = 0;
		for (int x : arr) {
			if (x == n) {
				count++;
			}
		}
		return count;
	}

	static int[] randomArr(int size, int end) {

		return randomArr(size, 0, end);
	}

	static int[] randomArr(int size, int start, int end) {
		Random r = new Random();
		int[] arr = new int[size];

		for (int i = 0; i < size; i++) {
			arr[i] = r.nextInt(end - start - 1) + start;
		}
		return arr;
	}

}
