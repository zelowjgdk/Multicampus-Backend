package algorithm.ch01;

import java.util.ArrayList;
import java.util.HashSet;

public class ArrayListEx01{
	public static void main(String[] args) {
		
	
	ArrayList list = new ArrayList();
	
	list.add("全辨悼");
	list.add("全辨悼");
	list.add("全辨悼");
	list.add(100);
	list.add(11.22);
	list.add('巢');
	list.add(true);
	
	HashSet list2 = new HashSet();
	for (int i = 0; i < list.size(); i++) {
		list2.add(list.get(i));
	}
	System.out.println(list2);
	
	list.add(0, "辫辨悼");
	System.out.println(list);
	
	list.remove(0);
	System.out.println(list);
	
	list.set(0, "沥辨悼");
	System.out.println(list);
	
	int index = list.indexOf(true);
	System.out.println(index);
	
	boolean result = list.contains(11.2);
	System.out.println(result);
}

}