
public class Cordados extends Animal {
	private String classe;
	
	public String getClasse() {
		return classe;
	}
	
	public void setClasse(String newClasse) {
		classe=newClasse;
	}
	
	public void caracCordados() {
		setFilo("Cordados");
		caracAnimal();
		System.out.printf("\n* Por pertencer ao filo dos %s:\n",getFilo());
		System.out.println("\t- Durante a fase embrionária todos apresentam tubo nervoso dorsal, notocorda, fendas faringianas e cauda pós-anal;");
		System.out.println("\t- Triblástico: conta com a ectoderme, a mesoderme e a endoderme;");
		System.out.println("\t- Celomados: tem uma cavidade revestida pela mesoderme, que origina os órgãos internos;");
		System.out.println("\t- Deuterostômios: o blastóporo dá origem, inicialmente, ao ânus;");
		System.out.println("\t- Sistema digestório completo;");
	}
}
