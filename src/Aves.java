
public class Aves extends Cordados{
	private String divisao;
	
	public String getDivisao() {
		return divisao;
	}
	
	public void setDivisao(String newDivisao) {
		divisao=newDivisao;
	}
	
	public void caracAves() {
		setClasse("Aves");
		caracCordados();
		System.out.printf("\n* Por pertencer � classe das %s:\n",getClasse());
		System.out.println("\t- Corpo revestido de penas;");
		System.out.println("\t- Endot�rmicos: capacidade de manter a temperatura corporal constante;");
		System.out.println("\t- ;");
		System.out.println("\t- Sistema digest�rio completo;");
	}
}
