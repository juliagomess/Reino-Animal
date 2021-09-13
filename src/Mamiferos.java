
public class Mamiferos extends Cordados {
	private String habitat;
	
	public String getHabitat() {
		return habitat;
	}
	
	public void setHabitat(String newHabitat) {
		habitat=newHabitat;
	}
	
	public void caracMamiferos() {
		setClasse("Mamíferos");
		caracCordados();
		System.out.printf("\n* Por pertencer à classe dos %s:\n",getClasse());
		System.out.println("\t- Presença de endoesqueleto: estrutura protege o sistema nervoso central e permite a movimentação do corpo, integrando-se ao sistema muscular;");
		System.out.println("\t- Ser altamente adaptáveis;");
		System.out.println("\t- Vive em sociedades;");
		System.out.println("\t- Presença de pelos;");
		System.out.println("\t- Reprodução sexuada;");
	}
}
