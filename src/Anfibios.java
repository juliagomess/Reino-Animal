
public class Anfibios extends Cordados {
	private String grupo;
	
	public String getGrupo() {
		return grupo;
	}
	
	public void setGrupo(String newGrupo) {
		grupo=newGrupo;
	}
	
	public void caracAnfibios() {
		setClasse("Anf�bios");
		caracCordados();
		System.out.printf("\n* Por pertencer � classe dos %s:\n",getClasse());
		System.out.println("\t- Forte vincula��o com a �gua;");
		System.out.println("\t- Fecunda��o geralmente externa;");
		System.out.println("\t- Pulm�es onde ocorrem trocas gasosas;");
		System.out.println("\t- Pele perme�vel, que tamb�m executam trocas gasosas;");
		System.out.println("\t- Cora��o, com dois �trios e um ventr�culo, aumentando a efici�ncia de transporte de sangue;");
		System.out.println("\t- Patas bem definidas;");
	}
}
