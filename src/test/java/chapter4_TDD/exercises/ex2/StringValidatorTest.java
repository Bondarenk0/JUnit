package chapter4_TDD.exercises.ex2;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

public class StringValidatorTest {

	@Test
	public void validate_passNotValidString_shouldReturnEmptyList() {
		List<String> emptyList = new ArrayList<>();
		String testString  = "abc 12";
		List<String> result = StringValidator.validate(testString);
		assertTrue(result.equals(emptyList));
	}
	
	@Test
	public void validate_passStringWithOneCorrectSequence_shouldBeEqual() {
		List<String> expectedList = new ArrayList<>();
		expectedList.add("345");
		String testString  = "cdefg 345 12bb23";
		List<String> result = StringValidator.validate(testString);
		assertTrue(result.equals(expectedList));
	}
	
	@Test
	public void validate_passStringWithTwoCorrectSequences_shouldBeEqual() {
		List<String> expectedList = new ArrayList<>();
		expectedList.add("345");
		expectedList.add("678");
		String testString  = "cdefg 345 12bbb33 678tt";
		assertTrue(expectedList.equals(StringValidator.validate(testString)));
	}

}
