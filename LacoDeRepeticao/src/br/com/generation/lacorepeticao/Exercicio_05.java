package br.com.generation.lacorepeticao;

import java.util.Scanner;

public class Exercicio_05 {
	/*Crie um programa que leia um n�mero do teclado at� que encontre um
	n�mero igual a zero. No final, mostre a soma dos n�meros
	digitados.*/
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		double n = 0, soma = 0;
		
		do {
			
			System.out.println("Digite um n�mero:");
			n = in.nextDouble();
			
			if(n != 0){
				soma = soma +n;
				
				System.out.println("Caso queira para a inser��o de n�meros, digite o n�mero --> 0 <---. \n");
			}
			
			else {
				System.out.println("Soma finalizada... \n");
			}
			
		}
		
		while 
			(n != 0);
		
			
		System.out.println("O total da soma dos valores que foram digitados �: " +soma);
		

	}

}
