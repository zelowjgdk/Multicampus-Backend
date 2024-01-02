package algorithm.정리문제;

public class 정리문제_기본3 {
	public static void main(String[] args) {
		System.out.println("3------------------");
		String s1 = "참좋다", s2 = "진짜좋다";
		System.out.println(s1.equals(s2));

		int n1 = s1.length();
		int n2 = s2.length();

		if (n1 > n2) {
			System.out.println("s1이 더 크다");
		} else {
			System.out.println("s2가 더 크다");
		}

		System.out.println("4-------------------");
		String s3 = "나는 진짜 java programmer가 되었어";
		String result = s3.substring(6, 21);

		System.out.println(result);
		System.out.println(result.toUpperCase());

		System.out.println("5------------------");
		String s4 = "2056521";
		char result2 = s4.charAt(0);

		if (result2 == '1') {
			System.out.println("남자임");
		} else {
			System.out.println("여자임");

		}
	}
}
