
public class Apodes extends Anfibios {
	public void caracApodes() {
		setGrupo("Apodes");
		caracAnfibios();
		System.out.printf("\n* Por pertencer ao grupo dos %s:\n",getGrupo());
		System.out.println("\t- Corpo cil�ndrico;");
		System.out.println("\t- N�o possui patas;");
		System.out.println("\t- Mais ativa a noite;");
	}
}