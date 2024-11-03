package vetoresematrizes;

import java.util.Scanner;

public class Vetores2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int vetorNumeros[] = new int[10];
		int vetorPares[] = new int[5];
		// int vetorImpares[] = new int[5];
		int soma = 0, j = 0;
		float media = 0;

		for (int i = 0; i < vetorNumeros.length; i++) {
			// inserindo os numeros no vetor
			System.out.println("Digite o " + (i + 1) + "º numero: ");
			vetorNumeros[i] = scanner.nextInt();
			soma = vetorNumeros[i] + soma;
		}

		for (int i = 0; i < vetorNumeros.length; i++) {

			if (vetorNumeros[i] % 2 == 0) {
				
				for ( j = 0; j < vetorPares.length; j++) {
				vetorPares[j] = vetorNumeros[i];
				}
				
			}
		}

		media = soma / vetorNumeros.length;

		System.out.println("\n\nElementos nos índices ímpares: " + vetorNumeros[1] + " , " + vetorNumeros[3] + " , "+ vetorNumeros[5] + " , " + vetorNumeros[7] + " , " + vetorNumeros[9]);
		
		System.out.println("a soma dos elementos é igual a: " + soma);
		//na média não esta puxando o numero depois da virgula, era pra dar "5,5" e ta dando "5"
		System.out.printf("a soma dos elementos é igual a: %.2f", media);
		
		//ta dando erro na hora de colocar os numeros no vetor de numeros pares!!!!
		System.out.println("Elementos pares: " + vetorPares[j]); //+ " , " + vetorNumeros[2] + " , " + vetorNumeros[4]+ " , " + vetorNumeros[6] + " , " + vetorNumeros[8]);

		scanner.close();

	}

}
