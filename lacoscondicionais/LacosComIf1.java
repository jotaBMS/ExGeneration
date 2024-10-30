/* Faça um algoritmo em Java que leia 3 valores inteiros A, B e C e
 *  imprima na tela se a soma de A + B é maior, menor ou igual a C.

*/

package lacoscondicionais;

import java.util.Scanner;

public class LacosComIf1 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int A, B, C;
		
		System.out.println("escreva o primeiro numero:");
		A = ler.nextInt();
		
		System.out.println("escreva o segundo numero:");
		B = ler.nextInt();
		
		System.out.println("escreva o terceiro numero:");
		C = ler.nextInt();
		
		if((A + B) > C) {
			System.out.println("A Soma de A + B é Maior do que C");
		}
		else if((A + B) < C) {
			System.out.println("A Soma de A + B é Menor do que C");
		}
		else if((A + B) == C) {
			System.out.println("A Soma de A + B é Igual a C");
		}
		
		ler.close();

	}

}
