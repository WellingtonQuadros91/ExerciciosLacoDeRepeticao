package br.com.generation.lacorepeticao;

import java.util.Scanner;

public class Exercicio02 {
	
	/*Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares.*/

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		
		int i, n, pares = 0, impares = 0, � = 1;
		
		for(i = 0; i < 10 ; i++) {
			
			System.out.println("Digite o " +(�++)+"� n�mero:");
			n = entrada.nextInt();
			
			if(n % 2 == 0) {
				pares ++ ;	
			}	
			
			else {
				impares ++;				
			}
			
		}

			System.out.println("A quantidade de n�meros impares s�o: " + pares);	
			System.out.println("A quantidade de n�meros pares s�o: " + impares);

	}

}
