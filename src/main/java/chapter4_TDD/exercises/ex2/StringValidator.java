package chapter4_TDD.exercises.ex2;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringValidator {

	public static List<String> validate(String str) {
		List<String> returnedList = new ArrayList<>();
		Pattern patten = Pattern.compile("\\d{3,}");
		Matcher matcher = patten.matcher(str);
		while(matcher.find()) {
			returnedList.add(matcher.group());
		}
		return returnedList;
	}
	

}
