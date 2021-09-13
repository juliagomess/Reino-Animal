
public class Anuros extends Anfibios {
	public void caracAnuros() {
		setGrupo("Anuros");
		caracAnfibios();
		System.out.printf("\n* Por pertencer ao grupo dos %s:\n",getGrupo());
		System.out.println("\t- Possui patas e não apresenta cauda;");
	}
}
