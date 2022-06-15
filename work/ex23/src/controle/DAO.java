package controle;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import modelo.planilha;


public class DAO {

	private BufferedWriter bw;
	private BufferedReader br;
	
	private String entrada = "C:\\Users\\DESENVOLVIMENTO\\Desktop\\work\\ex23\\Dados\\entrada.csv";
	private String saida = "C:\\Users\\DESENVOLVIMENTO\\Desktop\\work\\ex23\\Dados\\saida.csv";
	
	public ArrayList<planilha> abrir() {
		ArrayList<planilha> linhas = new ArrayList<>();
		planilha p;
		try {
			br = new BufferedReader(new FileReader(entrada));
			String l = br.readLine();
			while(l != null) {
				p = new planilha(l);
				linhas.add(p);
				l = br.readLine();
			}
			br.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		return linhas;
	 
	}

	public void salvarSoma(ArrayList<planilha> linhas) {
		try {
			bw = new BufferedWriter(new FileWriter(saida));
			for (planilha l : linhas) {
				bw.write(l.adicao()+"\r\n");
			}
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public void salvarMul(ArrayList<planilha> linhas) {
		try {
			bw = new BufferedWriter(new FileWriter(saida));
			for (planilha l : linhas) {
				bw.write(l.mult()+"\r\n");
			}
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public void salvarDiv(ArrayList<planilha> linhas) {
		try {
			bw = new BufferedWriter(new FileWriter(saida));
			for (planilha l : linhas) {
				bw.write(l.div()+"\r\n");
			}
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void salvarSub(ArrayList<planilha> linhas) {
		try {
			bw = new BufferedWriter(new FileWriter(saida));
			for (planilha l : linhas) {
				bw.write(l.sub()+"\r\n");
			}
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}