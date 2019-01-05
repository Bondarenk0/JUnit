package chapter4_TDD;

public class FootballTeam implements Comparable<FootballTeam> {
	private int gamesWon;
	
	public FootballTeam(int gamesWon) {
		if(gamesWon < 0) {
			throw new IllegalArgumentException();
		}		
		this.gamesWon = gamesWon;
	}
	
	public int getGamesWon() {
		return gamesWon;
	}

	@Override
	public int compareTo(FootballTeam o) {
		return Integer.compare(this.gamesWon, o.getGamesWon());
	}
	
	
}
