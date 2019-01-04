package chapter3_unit_tests_without_collaborators.exercises.ex4;

import static junitparams.JUnitParamsRunner.$;

import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

@RunWith(JUnitParamsRunner.class)
public class FarenheitCelciusConverterTest {
	
	private static final Object[] getCelciusData() {
		return new Object[] {
				new Object[] {32, 0},
				new Object[] {98, 37},
				new Object[] {212, 100}
		};
	}
	
	private static final Object[] getFahrenheitData() {
		return new Object[] {				
				new Object[] {0, 32},
				new Object[] {37, 100},
				new Object[] {100, 212}
		};
	}
	
	@Test
	@Parameters(method = "getCelciusData")
	public void testConvertionFromCelciumToFahrenheit(int celsium) {
		//TODO this class was created only for testing parameterized tests
		System.out.println(celsium);
	}
	
	@Test
	@Parameters(method = "getFahrenheitData")
	public void testConvertionFromFahrenheitToCelcium(int fahrenheit) {
		//TODO this class was created only for testing parameterized tests
		System.out.println(fahrenheit);
	}
	
	
}
