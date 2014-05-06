import java.util.*;

public class Competition {
	private boolean fFinish;
	private ArrayList<Team> table;
	
	public JudgeTeam judgeTeam;
	
	Competition () {
		fFinish = false;
		this.table = new ArrayList<Team>();
	}
	
	public void addParticipant (Team team){
		table.add(team);
	}
	
	private void markSkater(SingleSkater skater){
		skater.setTechnicalScore();
		skater.setProgramScore(this.judgeTeam.mark(skater));
	}
	
	private void markPair(SkatePair pair){
		pair.setTechnicalScore();
		pair.setProgramScore(this.judgeTeam.mark(pair));
	}
	
	public void inviteJudgesFrom(Country c1, Country c2, Country c3, Country c4, Country c5) {
		Judge j1 = new Judge(65, Country.GER);
		Judge j2 = new Judge(63, Country.UK);
		Judge j3 = new Judge(19, Country.IT);
		Judge j4 = new Judge(33, Country.RUS);
		Judge j5 = new Judge(99, Country.RUS);
		
		judgeTeam = new JudgeTeam(j1, j2, j3, j4, j5);
	}
	
	
	private void part1(){		
		for (Team team:table) {
			markSkater(team.men);
			markSkater(team.women);
			
			markPair(team.pair);
			markPair(team.dancers);
		}
		
		Collections.sort(table, new Comparator<Team>() {
			public int compare(Team t1, Team t2) {
				return (int) (t2.getScoreSecondary() - t1.getScoreSecondary());
			}
		});
		
		for (int i = 0; i < table.size(); i++) {
			if (i < 9) { 
				table.get(i).setScorePrimary(10 - i);
			}
			else {
				table.get(i).setScorePrimary(0);
			}
		}

	}
	
	private void part2 () {
		for (int i = 0; i<5 && i<table.size(); i++) {
			markSkater(table.get(i).men);
			markSkater(table.get(i).women);
			
			markPair(table.get(i).pair);
			markPair(table.get(i).dancers);
		}
		
		Collections.sort(table, new Comparator<Team>() {
			public int compare(Team t1, Team t2) {
				return (int) (t2.getScoreFinalSecondary() - t1.getScoreFinalSecondary());
			}
		});
		

		for (int i = 0; i<5 && i<table.size(); i++) 
				table.get(i).setScoreFinalPrimary(10 - i);
			
		
	}
	private void countResults() {
		Collections.sort(table, new Comparator<Team>() {
			public int compare(Team t1, Team t2) {
				return (int) (t2.scoreFinalPrimary + t2.scorePrimary - t1.scoreFinalPrimary + t1.scorePrimary);
			}
		});
		
		for (Team team:table) {
			System.out.println(team.country.toString()+' '+team.scoreSecondary+' '+team.scorePrimary+' '+team.scoreFinalSecondary+' '+team.scoreFinalPrimary+' '+(team.scoreFinalPrimary + team.scorePrimary) );
		}
	}
	private void revealWinners() {
		if (fFinish) {
			Team winner = table.get(0);
			System.out.println("The team from "+winner.country.toString()+" is OUR CHAMPION11!1!");
			System.out.println("ROASTER: man: "+winner.men.name+" woman: " + winner.women.name);
			System.out.println("         pair: "+winner.pair.firstSkater.name+" and " + winner.pair.secondSkater.name);
			System.out.println("         dancers: "+winner.dancers.firstSkater.name+" and " + winner.dancers.secondSkater.name);
				
		}
		else {
			System.out.println("Competition have not been complete");
		}
	}
	public void start() {
		if (fFinish) {
			System.out.println("Competition already complite");
		}
		
		part1();
		part2();
		countResults();
		fFinish = true;

		revealWinners();
	}
 }
