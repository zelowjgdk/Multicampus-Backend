package algorithm.ch00;

import java.util.Random;

public class ex09 {

	public static void main(String[] args) {
		int[] jumsu = new int[1000];
		Random r = new Random(33);

		for (int i = 0; i < jumsu.length; i++) {
			jumsu[i] = r.nextInt(1000);
		}

		
		// 1.최대값을 찾아보세요.
		int max = ex05_ArrayUtil.findMax(jumsu);
		
		/*
		 * int max = jumsu[0];
		 * for (int i = 0; i < jumsu.length; i++) { 
		 * if (max <jumsu[i]) {
		 *  max = jumsu[i]; } }
		 */
		System.out.println("최대값은 " + max);

		// 2.최대값이 있는 위치를 찾아보세요.
		int count = 0;
		for (int i = 0; i < jumsu.length; i++) {
			if (jumsu[i] == max) {
				System.out.println(max + "의 위치값" + i);
				count++;
			}
		}
		// 3.최대값이 들어있는 개수를 카운트 해보세요.
		System.out.println("최대값의 개수는 " + count + "개");

	}
}
