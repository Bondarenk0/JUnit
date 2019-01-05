package chapter3_unit_tests_without_collaborators.exercises.ex4;


import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;

import chapter4_TDD.FootballTeam;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

@RunWith(JUnitParamsRunner.class)
public class FarenheitCelciusConverterTest {
	
	@SuppressWarnings("unused")
	private static final Object[] getCelciusData() {
		return new Object[] {
				new Object[] {32, 0},
				new Object[] {98, 37},
				new Object[] {212, 100}
		};
	}
	
	@SuppressWarnings("unused")
	private static final Object[] getFahrenheitData() {
		return new Object[] {				
				new Object[] {0, 32},
				new Object[] {37, 100},
				new Object[] {100, 212}
		};
	}
	
	@Test
	@Parameters(method = "getCelciusData")
	public void testConvertionFromCelciumToFahrenheit(int celsium, int expected) {
		//TODO this class was created only for testing parameterized tests
		System.out.println(celsium);
	}
	
	@Test
	@Parameters(method = "getFahrenheitData")
	public void testConvertionFromFahrenheitToCelcium(int fahrenheit, int expected) {
		//TODO this class was created only for testing parameterized tests
		System.out.println(fahrenheit);
	}
	
	@Test
	public void compareTeams_twoTeamsWithDifferentGamesWon_teamWithBiggerGamesWonShouldWin() {
		FootballTeam footballTeam1 = new FootballTeam(1);
		FootballTeam footballTeam2 = new FootballTeam(2);
		assertTrue(footballTeam2.compareTo(footballTeam1) > 0);
	}
	
	
}
