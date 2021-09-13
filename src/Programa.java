
public class Programa {

	public static void main(String[] args) {
		Terrestres a1 = new Terrestres();
		a1.setNome("Cachorro");
		a1.caracTerrestres();
		
		System.out.println("\n====================================================================================");
		
		Marinhos a2 = new Marinhos();
		a2.setNome("Golfinho");
		a2.caracMarinhos();
		
		System.out.println("\n====================================================================================");
		
		Aereos a3 = new Aereos();
		a3.setNome("Morcego");
		a3.caracAereos();
		
		System.out.println("\n====================================================================================");
		
		Anuros a4 = new Anuros();
		a4.setNome("Sapo");
		a4.caracAnuros();
		
		System.out.println("\n====================================================================================");
		
		Urodelos a5 = new Urodelos();
		a5.setNome("Salamandra");
		a5.caracUrodelos();
		
		System.out.println("\n====================================================================================");
		
		Apodes a6 = new Apodes();
		a6.setNome("Cobra-cega");
		a6.caracApodes();
		
		System.out.println("\n====================================================================================");
		
		Carinatas a7 = new Carinatas();
		a7.setNome("Águia");
		a7.caracCarinatas();
		
		System.out.println("\n====================================================================================");
		
		Ratitas a8 = new Ratitas();
		a8.setNome("Águia");
		a8.caracRatitas();

	}

}
