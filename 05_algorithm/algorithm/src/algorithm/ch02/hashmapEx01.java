package algorithm.ch02;

import java.util.HashMap;
import java.util.Scanner;

public class hashmapEx01 {

	public static void main(String[] args) {

		HashMap<Character, Integer> map1 = new HashMap<>();
		HashMap<Character, Integer> map2 = new HashMap<>();

		Scanner sc = new Scanner(System.in);
		String data = sc.next();
		String ana = sc.next();

		char[] data2 = data.toCharArray();
		char[] ana2 = ana.toCharArray();

		// 찾을 값을 hashmap에 넣기
		// 문자열의 길이 3
		// {a=1,b=1,c=1}

		System.out.println(ana2.length);
		for (int i = 0; i < ana2.length; i++) {
			map1.put(ana2[i], map1.getOrDefault(ana2[i], 0) + 1);
		}
		System.out.println(map1);

		for (int i = 0; i < data2.length; i++) {
			int start = i;
			int end = i + map1.size() - 1;
			System.out.println(start + " " + end);
			// map2.put(data2[i],map2.getOrDefault(ana2[i],0)+1);
		}
		System.out.println(map1);

		System.out.println("=====================");
		System.out.println(data2.length);

		int count = 0;
		for (int i = 0; i < data2.length - 1; i++) {
			map2 = new HashMap<>();
			int start = i;
			int end = i + map1.size() - 1;
			if (end > +data2.length - 1) {
				map2.put(data2[i], map2.getOrDefault(data2[i], 0) + 1);
			}
			System.out.println(map2);
			System.out.println(map2.size());
			if (map1.equals(map2)) {
				count++;
			}
			System.out.println("============count>>" + count);

		}
	}
}
