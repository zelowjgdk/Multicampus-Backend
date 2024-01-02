package algorithm.ch02;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Ex01 {
public static void main(String[] args) {
	String s = "aaabbbcdddefe";
	HashSet<String> set=new HashSet<>();
	String [] s2 = s.split("");
	for (String c : s2) {
		set.add(c);
	}
	System.out.println(set);
	
	List<String> list = Arrays.asList(s2);
	Object[] set2 = set.toArray();
	String answer ="";
	
	for (Object x : set2) {
		if (Collections.frequency(list, x)==1) {
			answer += x;
		}
	}
	System.out.println(answer);
}
}
