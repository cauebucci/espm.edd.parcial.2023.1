package me.caue.exercicios.exc2;

import me.caue.listaduplagenerica.Lista;

public class Main {
	public static void main(String[] args) {
		Lista<Integer> lista = new Lista<>();
		
		
		lista.inserirFim(1);
		lista.inserirFim(2);
		lista.inserirFim(2);
		lista.inserirFim(4);
		lista.inserirFim(2);
		
		
		System.out.println("Lista: " + lista.imprimir());
		
		Lista<Integer> listaInvertida = inverterLista(lista);
		System.out.println("Lista Invertida: " + listaInvertida.imprimir());
	}
	
	public static Lista<Integer> inverterLista(Lista<Integer> lista) {
		Lista<Integer> aux = new Lista<>();
		
		for (int i = lista.getTamanho(); i >= 1; i--) {
			aux.inserirFim(lista.getElemento(i));
		}
		return aux;
	}
}
