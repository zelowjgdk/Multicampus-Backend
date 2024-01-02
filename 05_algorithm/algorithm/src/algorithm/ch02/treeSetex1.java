package algorithm.ch02;

import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class treeSetex1 {
	public static void main(String[] args) {
		// 10 3
		// 1 12 33 33 33 6 6 18 9 10 중 3번째 큰 수
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		int k = sc.nextInt();

		TreeSet<Integer> number2 = new TreeSet<Integer>(Collections.reverseOrder());
		// TreeSet <Integer> number2 = new TreeSet<Integer>();
		System.out.println(count);

		for (int i = 0; i < count; i++) {
			number2.add(sc.nextInt());
			System.out.println(number2);
		}
		System.out.println("------------");
		System.out.println(number2);
		System.out.println("------------");
		int findIndex = number2.size() - k;
		// 5 -1 =4
		// 5-2 =3

		System.out.println(findIndex);
		System.out.println(number2.first());
		Object[] result = number2.toArray();
		System.out.println(result[findIndex]);
	}
}
