package algorithm.ch00;

import java.util.HashMap;
import java.util.Map;

public class ex04_1 {

	public static void main(String[] args) {

		double[] numbers = { 11.1, 22.2, 22.2, 55.5, 22.2, 11.1, 40.2 };

		// 배열에 포함된 각 숫자가 각각 몇 개인지 카운트해서 출력
		Map<Double, Integer> map = new HashMap<Double, Integer>();

		for (double n : numbers) {
			Integer count = map.get(n);
			if (count == null) { // 처음 등장한 숫자
				map.put(n, 1);
			} else {
				map.put(n, count + 1);
			}
		}

		// 결과 출력
		for (double n : map.keySet()) {
			System.out.printf("%.1f: %d개\n", n, map.get(n));

		}
	}
}
