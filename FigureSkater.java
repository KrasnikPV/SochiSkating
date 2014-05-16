public class FigureSkater extends Human{
	protected double exp;
	
	public FigureSkater (Country country, double exp) {
		super(country);
		this.exp = exp; 
	}
	
	public int getDeduction(){
		double ran = Math.random() % 1;
		if (ran < 0.1) 
			return 2;
		if (ran < .3)
			return 1;
		if ((exp < 0.3) & (ran < 0.4))
			return 1;
		return 0;
	}
	
	public double getExp() {
		return exp;
	}
	
	public double getExpirience() {
		return exp;
	}
}
