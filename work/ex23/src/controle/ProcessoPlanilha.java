package controle;


import java.util.ArrayList;

import modelo.planilha;

public class ProcessoPlanilha {
	
	public static ArrayList<planilha> linhas = new ArrayList<>();
	private static DAO dao = new DAO();

	public static void carregar() {
		linhas = dao.abrir();
	}

	public static void saida(int opcao) {
	  switch(opcao) {
	  case 1 :
		  dao.salvarSoma(linhas);
		  break;
	  case 2:
		  dao.salvarMul(linhas);
		  break;
	  case 3:
		  dao.salvarSub(linhas);
		  break;
	  case 4:
		  dao.salvarDiv(linhas);
		  break;
	  }
	}
}