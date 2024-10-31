/* Escreva um algoritmo em Java, que leia números inteiros via teclado, 
 * até que o número zero seja digitado. Ao final, mostre na tela a soma 
 * de todos os números digitados, que sejam positivos.*/


package lacosderepeticao;

import java.util.Scanner;

public class LacosComDoWhile1 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int numero = 0, positivos = 0, somapositivos = 0;
		
		
		do {
			
			System.out.println("Digite um número: ");
			numero = scanner.nextInt();
			
			if(numero > 0) {
				
				somapositivos = somapositivos + numero;
			}
			
			
		}
		while(numero != 0);
		
		System.out.println("A soma dos números positivos é: "+ somapositivos);
		
		scanner.close();
	}

}
