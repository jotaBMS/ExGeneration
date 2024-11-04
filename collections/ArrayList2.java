/* 
Escreva um programa Java para criar uma Collection ArrayList de Objetos da 
Classe Wrapper Integer, inicializada com 10 valores inteiros. O programa 
deverá solicitar ao usuário, que ele digite via teclado 1 número inteiro e 
caso ele seja encontrado no ArrayList, exiba na tela a posição deste número na 
Collection. Caso o número não seja encontrado, ele deverá exibir na tela a 
mensagem: O número NN não foi encontrado! 
*/

package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList2 {

	public static void main(String[] args) {

		ArrayList<Integer> valores = new ArrayList<Integer>();
		Scanner scanner = new Scanner(System.in);

		int n1;

		for (int i = 0; i < 10; i++) {

			System.out.println("Digite um numero : ");
			valores.add(scanner.nextInt());

		}

		System.out.println("\nDigite um numero para ser encontrado na lista : ");
		n1 = scanner.nextInt();

		if (valores.contains(n1)) {

			System.out.println("\nO número " + n1 + " está localizado na posição: " + valores.indexOf(n1));

		} else {

			System.out.println("Digite o número que você deseja encontrar:");
			System.out.println("O número " + n1 + " não foi encontrado!");
		}

	}

}
