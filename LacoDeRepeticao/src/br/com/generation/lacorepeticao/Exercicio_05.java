package br.com.generation.lacorepeticao;

import java.util.Scanner;

public class Exercicio_05 {
	/*Crie um programa que leia um número do teclado até que encontre um
	número igual a zero. No final, mostre a soma dos números
	digitados.*/
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		double n = 0, soma = 0;
		
		do {
			
			System.out.println("Digite um número:");
			n = in.nextDouble();
			
			if(n != 0){
				soma = soma +n;
				
				System.out.println("Caso queira para a inserção de números, digite o número --> 0 <---. \n");
			}
			
			else {
				System.out.println("Soma finalizada... \n");
			}
			
		}
		
		while 
			(n != 0);
		
			
		System.out.println("O total da soma dos valores que foram digitados é: " +soma);
		

	}

}
