
public class Apodes extends Anfibios {
	public void caracApodes() {
		setGrupo("Apodes");
		caracAnfibios();
		System.out.printf("\n* Por pertencer ao grupo dos %s:\n",getGrupo());
		System.out.println("\t- Corpo cilíndrico;");
		System.out.println("\t- Não possui patas;");
		System.out.println("\t- Mais ativa a noite;");
	}
}