package vetoresematrizes;

import java.util.Scanner;

public class Vetores2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int vetorNumeros[] = new int[10];
		int n1;
		float media = 0, soma = 0;

		for (int i = 0; i < vetorNumeros.length; i++) {
			// inserindo os numeros no vetor (1 a 10)
			System.out.println("Digite o " + (i + 1) + "º numero: ");
			vetorNumeros[i] = scanner.nextInt();
			soma = vetorNumeros[i] + soma;
		}
		
		
		

		System.out.print("Elementos pares: ");
		for (int i = 0; i < vetorNumeros.length; i++) {

			if (vetorNumeros[i] % 2 == 0) {
				
					n1 = vetorNumeros[i];
					System.out.print(n1 + ", ");
			
			}
		}

		media = soma / vetorNumeros.length;

		System.out.println("\n\nElementos nos índices ímpares: " + vetorNumeros[1] + " , " + vetorNumeros[3] + " , "+ vetorNumeros[5] + " , " + vetorNumeros[7] + " , " + vetorNumeros[9]);

		System.out.println("a soma dos elementos é igual a: " + soma);
		
		System.out.printf("a média dos elementos é igual a: %.2f", media);


		scanner.close();

	}

}
