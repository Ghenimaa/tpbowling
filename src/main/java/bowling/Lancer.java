package bowling;

public class Lancer {
	private int nombresquilles;

	public Lancer(int nombresquilles) {
		if (nombresquilles > 10 || nombresquilles < -1) {
			throw new IllegalArgumentException("Impossible, Le nombre de quilles est incorrecte");
		}
		this.nombresquilles = nombresquilles;
	}
	
	public int getnombresquilles() {
		return nombresquilles;
	}
}
