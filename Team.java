
public class Team {
	public SingleSkater men;
	public SingleSkater women;

	public SkatePair pair;
	public SkatePair dancers;
	
	public Country country;
	
	public long scorePrimary;
	public long scoreSecondary; 
	public long scoreFinalPrimary;
	public long scoreFinalSecondary; 

	public Team (Country country){
		this.country = country;
		this.men = new SingleSkater(country);
		this.women = new SingleSkater(country);
		
		this.pair = new SkatePair(country);
		this.dancers =  new SkatePair(country);

	}
	
	

	public double getScorePrimary() {
		return scorePrimary;
	}

	public void setScorePrimary(double scorePrimary) {
		this.scorePrimary = Math.round(scorePrimary);
	}

	public double getScoreSecondary() {
		scoreSecondary = Math.round(men.getProgramScore() + women.getProgramScore() + pair.getProgramScore() +dancers.getProgramScore());
		return scoreSecondary;
	}

	public void setScoreSecondary(double scoreSecondary) {
		this.scoreSecondary = Math.round(scoreSecondary);
	}

	public double getScoreFinalPrimary() {
		return scoreFinalPrimary;
	}

	public void setScoreFinalPrimary(long scoreFinalPrimary) {
		this.scoreFinalPrimary = scoreFinalPrimary;
	}

	
	public double getScoreFinalSecondary() {
		scoreFinalSecondary = Math.round(men.getProgramScore() + women.getProgramScore() + pair.getProgramScore() +dancers.getProgramScore());

		return scoreFinalSecondary;
	}

	public void setScoreFinalSecondary(long scoreFinalSecondary) {
		this.scoreFinalSecondary = scoreFinalSecondary;
	}

}
