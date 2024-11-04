/* Escreva um programa Java para criar uma Collection Set de Objetos da Classe Wrapper Integer, 
 * inicializada com 10 valores inteiros. O programa deverá solicitar ao usuário, que ele digite 
 * via teclado 1 número inteiro e caso ele seja encontrado no Set, exiba na tela a mensagem: 
 * Número 00 Encontrado! Caso o número não seja encontrado, ele deverá exibir na tela a mensagem: 
 * O número NN não foi encontrado! */

package collections;

import java.util.HashSet;
import java.util.Scanner;

public class Set2 {

	public static void main(String[] args) {


		HashSet<Integer> numeros = new HashSet<Integer>();

		Scanner scanner = new Scanner(System.in);
		
		int n1; //2,5,1,3,4,9,7,8,10,6
		
		numeros.add(2);
		numeros.add(5);
		numeros.add(1);
		numeros.add(3);
		numeros.add(4);
		numeros.add(9);
		numeros.add(7);
		numeros.add(8);
		numeros.add(10);
		numeros.add(6);
		
		
		System.out.println("\nDigite um numero para ser encontrado na lista : ");
		n1 = scanner.nextInt();
		
		if(numeros.contains(n1)) {
		System.out.println("\nO número "+ n1 +" foi encontrado! ");  
		
		}
		else {
			
			System.out.println("\nO número "+ n1 +" não foi encontrado!");  
		}
	}

}
