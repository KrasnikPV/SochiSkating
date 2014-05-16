
public class SingleSkater extends FigureSkater {
	private long technicalScore;
	private long programScore;
	
	public SingleSkater (Country country) {
		super (country, Math.random()%1);
	}
	
	public void  setTechnicalScore() {
		this.technicalScore = Math.round(25 + 25*this.exp + Math.random()%4 - this.getDeduction());
	}
	
	public void  setProgramScore(double ps) {
		this.programScore = Math.round(ps);
	}
	
	public long getTechnicalScore() {
		return this.technicalScore;
	}
	
	public long getProgramScore () {
		return this.programScore;
	}
	
}
