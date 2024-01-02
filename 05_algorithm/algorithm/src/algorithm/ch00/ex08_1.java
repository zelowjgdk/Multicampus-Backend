package algorithm.ch00;

import java.util.Random;

public class ex08_1 {

	public static void main(String[] args) {
		Random r = new Random(100);

		int[] s = ex05_ArrayUtil.randomArr(10000, 0, 100);

		int min = s[0];
		int count = 0; // 1이 몇개인가?
		for (int i = 0; i < s.length; i++) {
			if (s[i] < min) {
				min = s[i];
			}
		}
		System.out.println(min); // 1

		String result = "";
		for (int i = 0; i < s.length; i++) {
			if (s[i] == min) {
				count++;
				// system.out.println(i);
				result += i + " ";
				// result=result + i + " ";
			}
		}
		System.out.println("최소값인 " + min + "의 개수는 " + count + "개");
		System.out.println(result);
	}
}
