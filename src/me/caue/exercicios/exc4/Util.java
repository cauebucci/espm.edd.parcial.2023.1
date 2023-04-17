package me.caue.exercicios.exc4;

import me.caue.listaduplagenerica.Lista;

public class Util {
	private static Lista<Carga> listaCarga = new Lista<>();
	private static double pesoTotal = 0;
	
	public static String criarCarga(String cnpj, String empresa, String destino, double peso) {
		if(listaCarga.pesquisar(new Carga(cnpj)) != null) return "Essa carga já existe.";
		if(pesoTotal > 10000 || pesoTotal + peso > 10000) return "Limite de peso do navio foi exedido.";
		pesoTotal += peso;
		listaCarga.inserirFim(new Carga(empresa, cnpj, destino, peso));
		return "Carga registrada com sucesso";
	}
	
	public static String pesquisarCarga(String cnpj) {
		if(listaCarga.pesquisar(new Carga(cnpj)) == null) {
			return "Essa carga não existe!";
		}else {
			return listaCarga.pesquisarDados(new Carga(cnpj));
		}

	}
	
	public static String imprimirCargas() {
		if(listaCarga.getTamanho() == 0) {
			return "Nenhuma carga adicionada";
		}
		return listaCarga.imprimir();
	}
	
	public static String excluir(String cnpj) {
		if(listaCarga.pesquisar(new Carga(cnpj)) != null){
			listaCarga.remover(new Carga(cnpj));
			return "Carga excluida com sucesso!";
		}else {
			return "Essa carga não existe!";

		}
	}
}
