package bowling;

public class Derniertour extends Tour {
	private Lancer l3;
		
	public DernierTour() {
		l3 = new Lancer();
		}
	
		public int getScore(Lancer l1, Lancer l2) {
		return getLancer1().getnombresquilles() +getLancer1().getnombresquilles()+ l3.getnombresquilles();
	}


}
