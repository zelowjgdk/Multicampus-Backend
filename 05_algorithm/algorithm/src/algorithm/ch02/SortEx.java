package algorithm.ch02;

import java.nio.file.attribute.AclEntryType;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class SortEx {

	public String solution(String[] participant, String[] completion) {
		String answer = "";
		HashMap<String, Integer> map = new HashMap<>();

		for (String player : participant)
			map.put(player, map.getOrDefault(player, 0) + 1);
		for (String player : completion)
			map.put(player, map.get(player) - 1);

		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			if (entry.getValue() != 0) {
				answer = entry.getKey();
				break;
			}
		}
		return answer;

	}

}
