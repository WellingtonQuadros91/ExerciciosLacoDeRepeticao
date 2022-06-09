package br.com.generation.lacorepeticao;

import java.util.Scanner;

public class Exercicio_06 {
	
	/*Escrever um programa que receba vários números inteiros no teclado. E no
	final imprimir a média dos números múltiplos de 3. Para sair digitar
	0(zero).(DO...WHILE)*/
	
	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		
		int n = 0, soma = 0, i = 0;
		float media;
		
		do {
			
			System.out.println("Digite um número:");
			n = in.nextInt();
			
			
			if(n % 3 == 0) {
			
				soma = soma + n; 
				i++;
				}

		}
			while 
				(n != 0);
		
		media = soma / (i - 1);
		
		System.out.println("A média dos números digitados que são múltiplos de 3 é: " + media);
			

	}

}
