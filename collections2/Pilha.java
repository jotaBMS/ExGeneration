/* Escreva um programa contendo uma Collection Stack (Pilha) de Objetos string, para 
  organizar a retirada de livros de uma pilha. O programa deverá ter um Menu que 
  aceitará as opções 0, 1, 2 e 3:
  
1: Adicionar um novo livro na pilha. Deve solicitar o nome do livro.
2: Listar todos os livros da Pilha
3: Retirar um livro da pilha 
0: O programa deve ser finalizado. 

Caso a pilha esteja vazia, ao tentar retirar um livro da pilha, o programa deverá informar que a pilha está vazia.
 */

package collections2;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class Pilha {

	public static void main(String[] args) {

		Stack<String> PilhaLivros = new Stack<String>();
		Scanner scanner = new Scanner(System.in);
		
		int opcao;
		String livro;
		
		System.out.println("\n\n***********************************************************************");
		System.out.println("\n1:Adicionar um novo livro na pilha.");
		System.out.println("2: Listar todos os livros da Pilha");
		System.out.println("3: Retirar um livro da pilha");
		System.out.println("0: O programa deve ser finalizado.\n");
		System.out.println("***********************************************************************");

		System.out.println("\n\nDigite a opçao desejada");
		opcao = scanner.nextInt();

		while (opcao != 0) {

			switch (opcao) {
			
			
			
			
			case 1:
				System.out.println("\n\nDigite o nome do livro: ");
				livro = scanner.next();
				PilhaLivros.add(livro);

				System.out.println("\n\nCliente adicionado! pilha atual : " + PilhaLivros);
				break;

			case 2:

				Iterator<String> iterator = PilhaLivros.iterator();

				while (iterator.hasNext()) {
					System.out.println(iterator.next());
				}
			

				break;

			case 3:

				if (PilhaLivros.isEmpty()) {
					System.out.println("\nA pilha está vazia");

				} else {

					PilhaLivros.pop();

					System.out.println("\n\nUm Livro foi retirado da pilha!! pilha atual : " + PilhaLivros);
				}
				break;
			
				default: 
					System.out.println("\nescolha uma opção valida!");

			}
			System.out.println("\n\n***********************************************************************");
			System.out.println("\n1:Adicionar um novo livro na pilha.");
			System.out.println("2: Listar todos os livros da Pilha");
			System.out.println("3: Retirar um livro da pilha");
			System.out.println("0: O programa deve ser finalizado.\n");
			System.out.println("***********************************************************************");

			System.out.println("\n\nDigite a opçao desejada");
			opcao = scanner.nextInt();
			
			}
		
		
		System.out.println("\n\n!!!Programa finalizado!!!");
		
		
		
	}

}
