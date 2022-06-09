package br.com.generation.lacorepeticao;

import java.util.Scanner;

public class Exercicio_03 {

		/*Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
	21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
	idade for =-99.*/
	public static void main(String[] args) {
		
		int idade  = 0, contador1 = 0, contador2 = 0;
		
		Scanner in = new Scanner(System.in);
	
		
		while(idade != -99) {
			
			System.out.println("Digite a idade da pessoa: ");
			idade = in.nextInt();
			
			if(idade > 0 && idade < 21) {
				contador1++;
			}
			
			if(idade > 50) {
				contador2++;
			}
			
			System.out.println("Se quiser encerrar digite o número -99");
			
		}
			System.out.println("O número de pessoas menores de 21 anos é: " +contador1);
			System.out.println("O número de pessoas maiores de 50 anos é: " +contador2);
	}

}
