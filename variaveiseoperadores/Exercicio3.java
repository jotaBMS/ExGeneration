package variaveiseoperadores;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		float salario, noturno, horaex = 100, quanthora, descontos, salarioliq;
		
		System.out.println("digite o salario bruto:");
		salario = ler.nextFloat();
		
		System.out.println("digite o adicional noturno:");
		noturno = ler.nextFloat();
		
		System.out.println("digite quantidade de horas extras:");
		quanthora = ler.nextFloat();
		
		horaex = horaex * quanthora;
		
		System.out.println("digite o valor dos descontos:");
		descontos = ler.nextFloat();
		
		salarioliq = salario + noturno + horaex - descontos;
		
		System.out.println("O valor do seu salario liquido é de R$ "+ salarioliq);
		
		

	}

}
