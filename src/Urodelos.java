
public class Urodelos extends Anfibios {
	public void caracUrodelos() {
		setGrupo("Urodelos");
		caracAnfibios();
		System.out.printf("\n* Por pertencer ao grupo dos %s:\n",getGrupo());
		System.out.println("\t- Corpo alongado;");
		System.out.println("\t- Patas laterais;");
		System.out.println("\t- Longa cauda;");
	}
}
