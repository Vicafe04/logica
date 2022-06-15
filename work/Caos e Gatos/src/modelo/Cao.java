package modelo;

public class Cao extends Animal {

	private int qtdMotoqueiroAtacados;

	public Cao(String especie, String nome, float peso, String raca, int qtdMotoqueiroAtacados) {
		super(especie, nome, peso, raca);
		this.qtdMotoqueiroAtacados = qtdMotoqueiroAtacados;

	}

	public String toString() {
		return "Quatidade de motoqueiros atacados:" + qtdMotoqueiroAtacados +"\n"+ super.toString();
	}

}
