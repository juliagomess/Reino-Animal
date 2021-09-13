
public class Animal {
	private String nome;
	private String filo;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String newNome) {
		nome=newNome;
	}
	
	public String getFilo() {
		return filo;
	}
	
	public void setFilo(String newFilo) {
		filo=newFilo;
	}
	
	public void caracAnimal() {
		System.out.printf("%s e suas caracter�sticas",getNome());
		System.out.println("\n\n* Por pertencer ao Reino Animal:");
		System.out.println("\t- Heter�trofo: n�o produz o pr�prio alimento;");
		System.out.println("\t- Eucarionte: c�lulas com n�cleo envolvido por membrana");
		System.out.println("\t- Pluricelular: corpo formado por muitas c�lulas com fun��es espec�ficas;");
		System.out.println("\t- Aer�bicos: respira o oxig�nio;");
		System.out.println("\t- N�o possui celulose e clorofila;");
		System.out.println("\t- Possui tecidos e �rg�os;");
		System.out.println("\t- Simetria bilateral ou radial;");
	}
}
