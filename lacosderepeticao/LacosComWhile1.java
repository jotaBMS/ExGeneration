package lacosderepeticao;

import java.util.Scanner;

public class LacosComWhile1 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int idade=0, menores = -1, idosos = 0;
		
		while(idade >= 0) {
		System.out.println("Insira sua idade:");
		idade = scanner.nextInt();
		
		if(idade <= 21) {
			menores = menores + 1;
		}
		else if(idade > 50) {
			idosos = idosos + 1;
		}
		
		}
		
		System.out.println("Total de pessoas menores de 21 anos:"+ menores);
		System.out.println("Total de pessoas maiores de 50 anos:"+ idosos);
		
		scanner.close();
	}

}
