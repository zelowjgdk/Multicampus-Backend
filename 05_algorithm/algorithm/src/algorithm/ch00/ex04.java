package algorithm.ch00;

import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); // 키보드에 입력값을 입력

		double[] numbers = new double[5];

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = sc.nextDouble(); // String --> double
			// 데이터 입력 받음
		}

		sc.close(); // stream close

		for (double x : numbers) {
			System.out.println(x);
		}
		int count = 0; // 22.2이 몇개인지 0개로 초기화 해놓고

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == 22.2) {
				count++; // 카운팅함
			}
		}
		System.out.println("22.2의 개수는 " + count);

	}

}
