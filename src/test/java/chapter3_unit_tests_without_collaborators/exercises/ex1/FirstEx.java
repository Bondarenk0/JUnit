package chapter3_unit_tests_without_collaborators.excercises.ex1;

import static org.junit.Assert.*;

import org.junit.Test;

public class FirstEx {
	@Test
	public void multiply_3x5_expected15() {
		assertEquals(15, 3 * 5);
	}
}
