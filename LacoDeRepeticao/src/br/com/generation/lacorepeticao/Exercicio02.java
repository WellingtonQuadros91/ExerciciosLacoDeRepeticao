package br.com.generation.lacorepeticao;

import java.util.Scanner;

public class Exercicio02 {
	
	/*Ler 10 números e imprimir quantos são pares e quantos são ímpares.*/

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		
		int i, n, pares = 0, impares = 0, º = 1;
		
		for(i = 0; i < 10 ; i++) {
			
			System.out.println("Digite o " +(º++)+"º número:");
			n = entrada.nextInt();
			
			if(n % 2 == 0) {
				pares ++ ;	
			}	
			
			else {
				impares ++;				
			}
			
		}

			System.out.println("A quantidade de números impares são: " + pares);	
			System.out.println("A quantidade de números pares são: " + impares);

	}

}
