package modelo;

public class Veiculo {
	
	public String placa;
	public String marca;
	public String modelo;
	public String cor;
	public int anoModelo;
	public int anoFabrica��o;


public void Veiculo() {
	
}

public Veiculo(String placa, String marca, String modelo, String cor, int anoModelo, int anoFabrica��o) {
	super();
	this.placa = placa;
	this.marca = marca;
	this.modelo = modelo;
	this.cor = cor;
	this.anoModelo = anoModelo;
	this.anoFabrica��o = anoFabrica��o;
}

public String toString() {
	return "Veiculo [placa=" + placa + ", marca=" + marca + ", modelo=" + modelo + ", cor=" + cor + ", anoModelo="
			+ anoModelo + ", anoFabrica��o=" + anoFabrica��o + "]";
}

}