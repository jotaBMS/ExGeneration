/*Dado um vetor contendo 10 números inteiros não ordenados e não repetidos, 
 * construa um algoritmo que consiga pesquisar dados no vetor, onde o usuário 
 * irá digitar um número e o programa deve exibir na tela a posição deste número 
 * no vetor. Caso o número não seja encontrado, a mensagem: “Não foi encontrado!” 
 * deve ser exibida na tela. */ 


package vetoresematrizes;

import java.util.Scanner;

public class Vetores1 {

	public static void main(String[] args) { 

		Scanner scanner = new Scanner(System.in);
		int vetor[] = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };
		int numero, numeroSaida, i;

		System.out.println("Digite o número que você deseja encontrar: ");
		numero = scanner.nextInt();

		if ((numero >= 1) && (numero <= 10)) {

			for (i = 0; vetor[i] != numero; i++) {

			}

			System.out.println("O numero " + numero + " está naposição: " + (i + 1));

			
		}
		else {
			
			System.out.println("O número "+ numero +" não foi encontrado!");
		}
		
		scanner.close();
	}

}

