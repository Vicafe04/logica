package modelo;

public class Veiculo {
	
	public String placa;
	public String marca;
	public String modelo;
	public String cor;
	public int anoModelo;
	public int anoFabricação;


public void Veiculo() {
	
}

public Veiculo(String placa, String marca, String modelo, String cor, int anoModelo, int anoFabricação) {
	super();
	this.placa = placa;
	this.marca = marca;
	this.modelo = modelo;
	this.cor = cor;
	this.anoModelo = anoModelo;
	this.anoFabricação = anoFabricação;
}

public String toString() {
	return "Veiculo [placa=" + placa + ", marca=" + marca + ", modelo=" + modelo + ", cor=" + cor + ", anoModelo="
			+ anoModelo + ", anoFabricação=" + anoFabricação + "]";
}

}