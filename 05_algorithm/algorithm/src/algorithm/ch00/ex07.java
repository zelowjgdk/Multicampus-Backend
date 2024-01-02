package algorithm.ch00;

import java.util.Arrays;
import java.util.Random;

public class ex07 {
	
	//랜덤한 값 1000개를 발생시켜 배열에 넣어
	//1.최소값을 구하고, 순서도 수정
	//2.최대값을 구해보세요
	//3.최대값의 개수는?
	
	public static void main(String[] args) {
		int[] s = new int[1000]; // 공간
		//랜덤한 값 발생시키는 객체 생성

		Random r = new Random(100);

		for (int i = 0; i < s.length; i++) {
			s[i] = r.nextInt(999) + 1;
		}
		System.out.println(Arrays.toString(s));

		int max = s[0];
		for (int x : s) {
			if (x > max) {
				max = x;
			}
		}

		System.out.println("최대값>> " + max);

		//최대값이 몇 개인지 카운트
		int count = 0;
		for (int x : s) {
			if (x == max) {
				count++;
			}
		}
		System.out.println("최대값의 개수는 " + count + "개");

	}
}
