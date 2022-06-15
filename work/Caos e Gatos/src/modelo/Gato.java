package modelo;

public class Gato extends Animal {
	private int qtdVida = 7;

	public Gato(String especie,String nome,float peso,String raca,int qtdVida) {
		super(especie,nome,peso,raca);
		this.qtdVida = qtdVida;
	}

	
	public String toString() {
		return "quantidade de vidas" + super.toString();
	}
	
}
