/* Leia quatro valores float (n1, n2, n3, n4). A seguir, 
calcule e mostre a diferença do produto entre o n1 e n2 
pelo produto entre o n3 e o n4. */

package variaveiseoperadores;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		float n1, n2, n3, n4, dif;
		
		System.out.println("digite o primeiro numero:");
		n1 = ler.nextFloat();
		
		System.out.println("digite o segundo numero:");
		n2 = ler.nextFloat();
		
		System.out.println("digite o terceiro numero:");
		n3 = ler.nextFloat();
		
		System.out.println("digite o quarto numero:");
		n4 = ler.nextFloat();
		
		dif = (n1 * n2) - (n3 * n4);
		
		System.out.println("A diferença dos produtos é de "+ dif);
		
		
		ler.close();

	}

}
