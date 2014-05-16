abstract class Human
{
	private Country country;
	public long age;
	public String name;

	public String getCountry()
	{
		return country.name();
	}

	public Human (int age, String name, Country country)
	{
		this.age = age;
		this.name = name;
		this.country = country;
	}
	public Human (int age, Country country)
	{
		this.age = age;
		this.name = NameGen.n();
		this.country = country;
	}
	public Human (Country country)
	{
		this.age = 15 + Math.round(Math.random()%10);
		this.name = NameGen.n();
		this.country = country;
	}
	
	
}