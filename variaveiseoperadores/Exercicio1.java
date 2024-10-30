package variaveiseoperadores;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double salario, abono, salarion;
		
		System.out.println("digite o salario");
		salario = ler.nextDouble();
		
		System.out.println("digite o abono");
		abono = ler.nextDouble();
		
		salarion = salario + abono;
		
		System.out.println("Seu novo salario é de R$ "+ salarion);
		
		

	}

}
