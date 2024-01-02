package algorithm.정리문제;

import java.util.Arrays;
import java.util.Random;

public class 정리문제_기본2 {
	public static void main(String[] args) {
		Random r = new Random(5);

		int[] n = new int[20];
		for (int i = 0; i < n.length; i++) {
			n[i] = r.nextInt(900);
		}
		Arrays.sort(n);
		System.out.println(n[19]);

	}
}
