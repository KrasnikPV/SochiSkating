
public class JudgeTeam {
	private final Judge[] judges = new Judge[5];
	
	JudgeTeam (Judge j1, Judge j2, Judge j3, Judge j4, Judge j5) {
		this.setJudges (j1, j2, j3, j4, j5);
		for (int i=0; i<=4; i++) {
			this.judges[i].setMood(Math.random()%5.0); 
		}
	}
	
	private void setJudges (Judge j1, Judge j2, Judge j3, Judge j4, Judge j5){
		judges[0] = j1;
		judges[1] = j2;
		judges[2] = j3;
		judges[3] = j4;
		judges[4] = j5;
	}
	
	public double mark(SingleSkater skater) {
		double mark = skater.getTechnicalScore();
		for (Judge j:judges) {
			mark += 22 + 5*j.getMood(); 
			if (j.getCountry() == skater.getCountry()) {
				mark++;
			}
		}
		return mark;
	}
	
	public double mark(SkatePair pair) {
		double mark = pair.getTechnicalScore();
		for (Judge j:judges) {
			mark += 1 + j.getMood(); 
			if (j.getCountry() == pair.getCountry()) {
				mark++;
			}
		}
		return mark;
	}
}
