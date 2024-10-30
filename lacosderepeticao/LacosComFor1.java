/* Escreva um algoritmo em Java, que leia 2 números inteiros via 
 * teclado, onde o primeiro número deve ser menor do que o segundo número. 
 * Caso contrário, deve ser exibida uma mensagem na tela informando que o 
 * intervalo é inválido e sair do programa. No intervalo informado, mostre 
 * na tela todes os números que são múltiplos de 3 e 5. */

package lacosderepeticao;

import java.util.Scanner;

public class LacosComFor1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n1, n2, i=0;
		
		System.out.println("Digite o primeiro número do intervalo:");
		n1 = scanner.nextInt();		
	
		System.out.println("Digite o primeiro número do intervalo:");
		n2 = scanner.nextInt();
		
		if (n1 < n2) {
			
			for(i=n1; i<=n2; i++ ) {
				if((i%3 == 0) && (i%5 == 0) && (i != 0 )) {
				System.out.println(i +" é múltiplo de 3 e 5.");
				// falta colocar o "No Intervalo entre n1 e n2" enicma desse print de cima
			   //mas fazneod ovm oque ele aparecã só uma vez 
				}
				
			}
				
		}
		else {
			System.out.println("Intervalo inválido!");
		}
		scanner.close();
	    }
		
				
	}
		
		
		


