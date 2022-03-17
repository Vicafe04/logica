package modelo;

import java.util.Date;

public class Aluno {
	public int ra;
	public String nome;
	public Date nasc;
	public Nota notas[] = new Nota[4];
	
	public Aluno() {
		// TODO Auto-generated constructor stub
	}
	
	public Aluno(int ra, String nome, Date nasc) {
		this.ra = ra;
		this.nome = nome;
		this.nasc = nasc;
	}
	@SuppressWarnings("deprecation")
	public int calcIdade() {
		java.util.Date agora = new java.util.Date();  

			if (agora.getMonth() == nasc.getMonth()) {
				if (agora.getDay() >= nasc.getDay()) {
					return agora.getYear() - nasc.getYear();
				} else {
					return agora.getYear() - nasc.getYear() - 1;
				}
			} else if(agora.getMonth() > nasc.getMonth()) {
				return agora.getYear() - nasc.getYear();
			} else {
				return agora.getYear() - nasc.getYear() - 1;
			}
		}
	
	
	public String obterConceito() {
		boolean aprovado = true;
		for (int i = 0; i < notas.length; i++) {
			if(notas[i].obterMedia() <= 50) {
				aprovado = false;
				break;
			}
		}
		if(aprovado) {
			return "Aluno(a) " + nome + " foi APROVADO!";
		} else {
			return "Aluno(a) " + nome + " foi REPROVADO!";
		}
	}
}  	
