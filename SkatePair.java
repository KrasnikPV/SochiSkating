public class SkatePair {
	public FigureSkater firstSkater;
	public FigureSkater secondSkater;
	
	private double technicalScore;
	private double programScore;
	
	public void setTechnicalScore() {
		this.technicalScore = 15 + 10*this.firstSkater.exp + 10*this.secondSkater.exp + Math.random()%10 - this.getDeduction();
	}
	
	public void setProgramScore (double d) {
		this.programScore = d;
	}
	
	public double getTechnicalScore() {
		return this.technicalScore;
	}
	
	public double getProgramScore () {
		return this.programScore;
	}
	
	public String getCountry() {
		if (firstSkater.getCountry() == secondSkater.getCountry()) {
			return firstSkater.getCountry();
		}
		
		return "Error: 2 skaters from different countries paired";
		
	}

	public int getDeduction() {
		int d1, d2;
		d1 = firstSkater.getDeduction();
		d2 = secondSkater.getDeduction();
		
		if (d1 > d2)
			return d1;
			else 
				return d2;
	}
	
	public double getExp () {
		return 	firstSkater.getExp() + secondSkater.getExp();
	}
	public double getExpirience () {
		return 	firstSkater.getExp() + secondSkater.getExp();
	}
	
	SkatePair (Country country){
		firstSkater = new FigureSkater(country, Math.random()%1);
		secondSkater = new FigureSkater(country, Math.random()%1);

	}
}
