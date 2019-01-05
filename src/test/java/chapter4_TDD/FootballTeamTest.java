package chapter4_TDD;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

@RunWith(JUnitParamsRunner.class)
public class FootballTeamTest {

	private static final int THREE_GAMES_WON = 3;

	public Object[] numberOfGamesWon() {
		return new Object[] { new Object[] { 0 }, new Object[] { 1 }, new Object[] { 2 } };
	}

	@Test
	@Parameters(method = "numberOfGamesWon")
	public void constructorShouldSetGamesWon(int nbOfGamesWon) {
		FootballTeam team = new FootballTeam(nbOfGamesWon);
		assertEquals(nbOfGamesWon + " games passed to constructor, " + "but " + team.getGamesWon() + " were returned",
				nbOfGamesWon, team.getGamesWon());
	}

	public Object[] illigalNbOfGamesWon() {
		return new Object[] { new Object[] { -10 }, new Object[] { -1 } };
	}

	@Test(expected = IllegalArgumentException.class)
	@Parameters(method = "illigalNbOfGamesWon")
	public void constructorShouldThrowExceptionForIlligalGamesNb(int illegalNbOfGames) {
		new FootballTeam(illegalNbOfGames);
	}

	@Test
	public void isFootbalTeamComparable() {
		int someNumber = 10;
		FootballTeam footballTeam = new FootballTeam(someNumber);
		assertTrue("Should inplements comparable", footballTeam instanceof Comparable);
	}

	@Test
	public void teamsWithSameNumberOfMatchesWonShouldBeEqual() {
		FootballTeam teamA = new FootballTeam(2);
		FootballTeam teamB = new FootballTeam(2);
		assertTrue("both teams have won the same number of games: " + teamA.getGamesWon() + " vs. "
				+ teamB.getGamesWon() + " and should be ranked equal", teamA.compareTo(teamB) == 0);
	}

}
