public class Judge extends Human{
	private double mood;

	public double getMood() {
		return mood;
	}

	public void setMood(double mood) {
		this.mood = mood;
	}
	
	Judge (int age, String name, Country country) {
		super (age, name, country);
	}

	public Judge(int i, Country country) {
		super(i, country);
	}	
}
