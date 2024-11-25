package bowling;

/**
 * Cette classe a pour but d'enregistrer le nombre de quilles abattues lors des
 * lancers successifs d'<b>un seul et même</b> joueur, et de calculer le score
 * final de ce joueur
 */
public class PartieMonoJoueur {
	private Tour[] tours = new Tour[10];

	
	public PartieMonoJoueur() {
		for (int i = 0; i < 9; i++) {
			tours[i] = new Tour();
		}
		tours[9] = new Derniertour();
	}

	



	
	
	
}
