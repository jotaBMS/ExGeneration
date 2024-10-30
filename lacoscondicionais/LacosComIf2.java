/* Escreva um algoritmo em Java, que leia um número inteiro
 *  via teclado e mostre na tela uma mensagem indicando se este
 * número é par ou ímpar e se o número é positivo ou negativo.
*/

package lacoscondicionais;

import java.util.Scanner;

public class LacosComIf2 {

	public static void main(String[] args) {

		
		int n1;
		double resto;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("escreva o primeiro numero:");
		n1 = ler.nextInt();
		
		resto = n1 % 2;
		
		
		if(resto == 0 && n1 >= 0){
		System.out.println("O Número "+ n1 + " é par e positivo!");
		}
		else if(resto == 0 && n1 <= 0) {
		System.out.println("O Número "+ n1 + " é par e negativo!");
		}
		else if(resto != 0 && n1 <= 0) {
			System.out.println("O Número "+ n1 + " é impar e negativo!");
		}
		else if (resto != 0 && n1 >= 0) {
			System.out.println("O Número "+ n1 + " é impar e positivo!");
		}
		
		ler.close();
		
		
		
	}

}
