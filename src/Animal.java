
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
		System.out.printf("%s e suas características",getNome());
		System.out.println("\n\n* Por pertencer ao Reino Animal:");
		System.out.println("\t- Heterótrofo: não produz o próprio alimento;");
		System.out.println("\t- Eucarionte: células com núcleo envolvido por membrana");
		System.out.println("\t- Pluricelular: corpo formado por muitas células com funções específicas;");
		System.out.println("\t- Aeróbicos: respira o oxigênio;");
		System.out.println("\t- Não possui celulose e clorofila;");
		System.out.println("\t- Possui tecidos e órgãos;");
		System.out.println("\t- Simetria bilateral ou radial;");
	}
}
