
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
		System.out.println("\t- Durante a fase embrion�ria todos apresentam tubo nervoso dorsal, notocorda, fendas faringianas e cauda p�s-anal;");
		System.out.println("\t- Tribl�stico: conta com a ectoderme, a mesoderme e a endoderme;");
		System.out.println("\t- Celomados: tem uma cavidade revestida pela mesoderme, que origina os �rg�os internos;");
		System.out.println("\t- Deuterost�mios: o blast�poro d� origem, inicialmente, ao �nus;");
		System.out.println("\t- Sistema digest�rio completo;");
	}
}
