
public class Anfibios extends Cordados {
	private String grupo;
	
	public String getGrupo() {
		return grupo;
	}
	
	public void setGrupo(String newGrupo) {
		grupo=newGrupo;
	}
	
	public void caracAnfibios() {
		setClasse("Anfíbios");
		caracCordados();
		System.out.printf("\n* Por pertencer à classe dos %s:\n",getClasse());
		System.out.println("\t- Forte vinculação com a água;");
		System.out.println("\t- Fecundação geralmente externa;");
		System.out.println("\t- Pulmões onde ocorrem trocas gasosas;");
		System.out.println("\t- Pele permeável, que também executam trocas gasosas;");
		System.out.println("\t- Coração, com dois átrios e um ventrículo, aumentando a eficiência de transporte de sangue;");
		System.out.println("\t- Patas bem definidas;");
	}
}
