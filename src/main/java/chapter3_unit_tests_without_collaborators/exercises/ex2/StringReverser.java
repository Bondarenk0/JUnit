package chapter3_unit_tests_without_collaborators.exercises.ex2;

import java.util.ArrayList;
import java.util.List;

public class StringReverser {
	public static String reverse(String s) {
		if(s == null || s.isEmpty()) {
			throw new IllegalArgumentException("There is null or empty string");
		}
		
		List<String> tempArray = new ArrayList<>(s.length());
		for(int i = 0; i < s.length(); i++) {
			tempArray.add(s.substring(i, i + 1));
		}
		StringBuilder reversedString = new StringBuilder(s.length());
		for(int i = tempArray.size() - 1; i >= 0; i--){
			reversedString.append(tempArray.get(i));
		}
		
		return reversedString.toString();
	}
}
