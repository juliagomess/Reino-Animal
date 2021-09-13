
public class Terrestres extends Mamiferos{
	
	public void caracTerrestres() {
		setHabitat("Terrestre");
		caracMamiferos();
		System.out.printf("\n* É um mamífero %s.",getHabitat());
	}
}
