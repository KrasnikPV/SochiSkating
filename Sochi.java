
public class Sochi {

	public static void main(String[] args) {
		Competition sochi2014 = new Competition(); 
		
		sochi2014.inviteJudgesFrom(Country.GER, Country.IT, Country.RUS, Country.USA, Country.RUS);
		
		sochi2014.addParticipant(new Team(Country.UK));
		sochi2014.addParticipant(new Team(Country.GER));
		sochi2014.addParticipant(new Team(Country.IT));
		sochi2014.addParticipant(new Team(Country.CAN));
		sochi2014.addParticipant(new Team(Country.CN));
		sochi2014.addParticipant(new Team(Country.RUS));
		sochi2014.addParticipant(new Team(Country.USA));
		sochi2014.addParticipant(new Team(Country.FR));
    	sochi2014.addParticipant(new Team(Country.UA));
    	sochi2014.addParticipant(new Team(Country.JP));
		
		sochi2014.start();
		
	}

}
