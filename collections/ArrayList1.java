/* Escreva um programa Java para criar uma Collection ArrayList de Objetos da Classe String. 
  O programa deverá solicitar ao usuário, que ele digite via teclado 5 cores e deverá adicioná-las 
  individualmente no ArrayList. Em seguida, faça o que se pede:
  
 >>Mostre na tela todas as cores que foram adicionadas. 
 >>Mostre na tela todas as cores que foram adicionadas ordenadas em ordem crescente.
 */

package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList1 {

	public static void main(String[] args) {

		ArrayList<String> cores = new ArrayList<String>();
		Scanner scanner = new Scanner(System.in);

		int i = 0;

		for (i = 0; i < 5; i++) {

			System.out.println("Digite a cor: ");
			cores.add(scanner.next());

		}

		System.out.println("Listar todas as cores:");
		System.out.println(cores);// .get(0) +" , "+ cores.get(1) +" , "+ cores.get(2) +" , "+cores.get(3) +" , "+
									// cores.get(4) );

		cores.sort(null);

		System.out.println("\n\nListar todas as cores em ordem alfabetica:");
		System.out.println(cores);// .get(0) +" , "+ cores.get(1) +" , "+ cores.get(2) +" , "+cores.get(3) +" , "+
									// cores.get(4) );

	}

}
