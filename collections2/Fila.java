/* Escreva um programa contendo uma Collection Queue (Fila) de Objetos do tipo string, 
  para organizar uma fila por ordem de chegada dos Clientes de um Banco. O programa 
  deverá ter um Menu que aceitará as opções 0, 1, 2 e 3:
  
1: Adicionar um novo Cliente na fila. Deve solicitar o nome do Cliente.
2: Listar todos os Clientes na fila
3: Chamar (retirar) uma pessoa da fila 
0: O programa deve ser finalizado. 

Caso a fila esteja vazia, o programa deverá informar que a fila está vazia ao tentar retirar (chamar) um cliente da fila.
 */

package collections2;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Fila {

	public static void main(String[] args) {

		LinkedList<String> fila = new LinkedList<String>();
		Scanner scanner = new Scanner(System.in);

		int opcao;
		String nome;

		System.out.println("\n\n***********************************************************************");
		System.out.println("\n1: Adicionar um novo Cliente na fila.");
		System.out.println("2: Listar todos os Clientes na fila");
		System.out.println("3: Retirar uma pessoa da fila");
		System.out.println("0: O programa deve ser finalizado.\n");
		System.out.println("***********************************************************************");

		System.out.println("\n\nDigite a opçao desejada");
		opcao = scanner.nextInt();

		while (opcao != 0) {

			switch (opcao) {

			case 1:
				System.out.println("\n\nDigite o nome do cliente: ");
				nome = scanner.next();
				fila.add(nome);

				System.out.println("\n\nCliente adicionado! Fila atual : " + fila);
				break;

			case 2:

				Iterator<String> iterator = fila.iterator();

				while (iterator.hasNext()) {
					System.out.println(iterator.next());
				}
				// System.out.println("\n\nFila atual : " + fila);

				break;

			case 3:

				if (fila.isEmpty()) {
					System.out.println("\nA fila está vazia");

				} else {

					fila.remove();

					System.out.println("\n\nO cliente foi Chamado! Fila atual : " + fila);
				}
				break;
			

			}

			System.out.println("***********************************************************************");
			System.out.println("\n\n1: Adicionar um novo Cliente na fila. Favor digitar o nome do Cliente.");
			System.out.println("2: Listar todos os Clientes na fila");
			System.out.println("3: Retirar uma pessoa da fila");
			System.out.println("0: O programa deve ser finalizado.\n\n");
			System.out.println("***********************************************************************");

			System.out.println("\n\nDigite a opçao desejada");
			opcao = scanner.nextInt();

		}

		System.out.println("\n\n!!!Programa finalizado!!!");

	}

}
