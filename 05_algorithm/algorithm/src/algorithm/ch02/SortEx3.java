package algorithm.ch02;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortEx3 {
	public static void main(String[] args) {
		String[] s = { "aaa", "bbb", "ccc", "aaa" };
		// aaa가 있는 첫번째 index를 구해라.
		System.out.println(Arrays.binarySearch(s, "aaa"));

		// Arrays.fill(s,"hohoho"); 모두 채워라
		// System.out.println(Arrays.toString(s));

		Arrays.fill(s, 0, 2, "haha"); //0~1을 haha로 바꿔라
		System.out.println(Arrays.toString(s));
		
		//정렬
		List<String> list = Arrays.asList(s);
		Collections.sort(list);
		System.out.println(list);
		
		//순서 뒤집기
		Collections.reverse(list);
		System.out.println(list);
		//갯수 세주기(count)
		System.out.println(Collections.frequency(list, "haha"));
		System.out.println(Collections.frequency(list, "ccc"));
	}
}
