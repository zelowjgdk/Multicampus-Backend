package algorithm.ch02;

import java.util.Arrays;

public class SortEx4 {
public static void main(String[] args) {
	String s = "aaabbbccc";
	char [] c = new char[3];
	s.getChars(2, 5, c, 0);
	
	System.out.println(Arrays.toString(c));
	System.out.println(s.charAt(0));
}
}
