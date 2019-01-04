package chapter3_unit_tests_without_collaborators.exercises.ex2;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
@RunWith(JUnitParamsRunner.class)
public class StringReverserTest {
	
	public Object[] getCorrectParameters() {
		return new Object[] {
				new Object[] { "aaab", "baaa"},
				new Object[] {"test", "tset"},
				new Object[] {"_-_", "_-_"}
		};
	}
	
	public Object[] getIncorrectParameters() {
		return new Object[] {
				new Object[] { null},
				new Object[] {""}
		};
	}
	
	@Test
	@Parameters(method = "getCorrectParameters")
	public void reverse_addCorrectValuet_expectedReversedValues(String input, String expected) {
		assertEquals(expected, StringReverser.reverse(input));
	}
	
	@Test(expected= IllegalArgumentException.class)
	@Parameters(method= "getIncorrectParameters")
	public void reverse_passIncorrectParams_expectedException(String incorrectParameter) {
		StringReverser.reverse(incorrectParameter);
	}
	

}
