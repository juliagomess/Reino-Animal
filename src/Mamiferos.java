
public class Mamiferos extends Cordados {
	private String habitat;
	
	public String getHabitat() {
		return habitat;
	}
	
	public void setHabitat(String newHabitat) {
		habitat=newHabitat;
	}
	
	public void caracMamiferos() {
		setClasse("Mam�feros");
		caracCordados();
		System.out.printf("\n* Por pertencer � classe dos %s:\n",getClasse());
		System.out.println("\t- Presen�a de endoesqueleto: estrutura protege o sistema nervoso central e permite a movimenta��o do corpo, integrando-se ao sistema muscular;");
		System.out.println("\t- Ser altamente adapt�veis;");
		System.out.println("\t- Vive em sociedades;");
		System.out.println("\t- Presen�a de pelos;");
		System.out.println("\t- Reprodu��o sexuada;");
	}
}
