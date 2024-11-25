package bowling;

public class Tour {
	private int numero;
	private Lancer l1;
	private Lancer l2;
	private int score;
	
	public Tour() {
			l1 = new Lancer();
			l2 = new Lancer();
		}
		
	
	public int getScoreTour(Lancer l1, Lancer l2) {
		int premierScore =  l1.getnombresquilles();
		int deuxiemeScore = l2.getnombresquilles();
		if (l1.getnombresquilles() == 10) {
			score = premierScore + deuxiemeScore;
		} 
		else if (premierScore + deuxiemeScore == 10) {
			score = premierScore + deuxiemeScore;
		} 
		else {
			score = premierScore + deuxiemeScore;
		}
		return score;
	}


	public Lancer getLancer1() {
		return l1;
	}

	public Lancer getLancer2() {
		return l2;
	}
	
	
}
