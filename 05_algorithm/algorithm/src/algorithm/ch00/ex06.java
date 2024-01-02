package algorithm.ch00;

import java.util.Arrays;
import java.util.Random;

public class ex06 {

	public static void main(String[] args) {

		int[] s = new int[1000];

		Random r = new Random();
		for (int i = 0; i < s.length; i++) {
			s[i] = r.nextInt(999) + 1;
		}
		System.out.println(Arrays.toString(s));

		int min = s[0];
		for (int x : s) {
			if (x < min) {
				min = x;
			}
		}
	}
}
