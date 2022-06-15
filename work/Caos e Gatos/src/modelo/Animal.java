package modelo;

public class Animal {

	private String especie;
	private String nome;
	private float peso;
	private String raca;

	public Animal(String especie, String nome, float peso, String raca) {
		this.especie = especie;
		this.nome = nome;
		this.peso = peso;
		this.raca = raca;
	}

	public String toString() {
		return "Especie:" + especie + " \nnome:" + nome + "\npeso:" + peso + "\nraca:" + raca +"\n";
	}
	
}
