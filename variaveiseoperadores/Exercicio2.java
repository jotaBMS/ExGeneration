package variaveiseoperadores;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		float n1, n2, n3, n4, media;
		
		System.out.println("digite a primeira nota:");
		n1 = ler.nextFloat();
		
		System.out.println("digite a segunda nota:");
		n2 = ler.nextFloat();
		
		System.out.println("digite a terceira nota:");
		n3 = ler.nextFloat();
		
		System.out.println("digite a quarta nota:");
		n4 = ler.nextFloat();
		
		media = (n1 + n2 + n3 + n4) / 4;
		
		System.out.printf("Sua média final é de %.2f:", media);

	}

}
