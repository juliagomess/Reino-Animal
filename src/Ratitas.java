
public class Ratitas extends Aves {
	public void caracRatitas() {
		setDivisao("Ratita");
		caracAves();
		System.out.printf("\n* Por ser uma ave %s:\n",getDivisao());
		System.out.println("\t- Não apresenta uma quilha no osso externo (carena);");
		System.out.println("\t- Incapacidade de voar;");
	}
}
