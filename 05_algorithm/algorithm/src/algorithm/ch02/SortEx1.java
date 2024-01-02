package algorithm.ch02;

class SortEx1 {

	public String solution(String my_string) {
		String answer = "";

		for (int i = 0; i < my_string.length(); i++) {
			char c = my_string.charAt(i);
			if (c >= 'a' && c <= 'z')
				c = 32;
			else if (c >= 'A' && c <= 'Z')
				c += 32;
			answer += c;

		}
		return answer;
	}
}
