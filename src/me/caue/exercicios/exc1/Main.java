package me.caue.exercicios.exc1;
//Escreva um programa em Java contendo um método que receba duas pilhas e verifique se 
//as pilhas são iguais, ou seja, se elas têm os mesmos valores. O método deverá retornar true ou 
//false. 

import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Stack<Integer> pilha1 = new Stack<>();
		Stack<Integer> pilha2 = new Stack<>();
		
		pilha1.push(1);
		pilha1.push(2);
		pilha1.push(3);
		pilha1.push(4);
		pilha1.push(5);
		
		
		pilha2.push(1);
		pilha2.push(2);
		pilha2.push(3);
		pilha2.push(4);
		pilha2.push(5);
		
		if(verificarPilha(pilha1, pilha2)) {
			System.out.println("As pilhas são iguais.");
		}else {
			System.out.println("As pilhas são diferentes.");
		}
		
	}
	
	public static boolean verificarPilha(Stack<Integer> pilha1, Stack<Integer> pilha2) {
		
		if(pilha1.size() == pilha2.size()) {
			while(!pilha1.empty()) {
				
				if(!(pilha1.pop() == pilha2.pop())) {
					return false;
				}
			}
			return true;
		}
		return false;
	}
}
