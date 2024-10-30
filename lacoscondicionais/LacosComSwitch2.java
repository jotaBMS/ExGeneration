/* escreva um algoritmo em Java que leia o Nome do Colaborador (String),
 *  o Código do Cargo do Colaborador (número inteiro de 1 a 6) e o Salário (número float). 
 *  A seguir, mostre na tela o Nome do Colaborador, o Cargo e o novo Salário reajustado. */  



package lacoscondicionais;

import java.util.Scanner;

public class LacosComSwitch2 {
	
public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int cargo;
		double salario, salariof;
		String nome;
		
		
		System.out.println("                CATALOGO DE PRODUTOS                  ");
		System.out.println(" -  Cod.Cargo    -     Cargo           -   % do Reajuste    ");
		System.out.println(" -     1         -     Gerente         -       10%          ");
		System.out.println(" -     2         -     Vendedor        -        7%          ");
		System.out.println(" -     3         -     Supervisor      -        9%          ");
		System.out.println(" -     4         -     Motorista       -        6%          ");
		System.out.println(" -     5         -     Estoquista      -        5%          ");
		System.out.println(" -     6         -     Técnico de TI   -        8%          ");
		
		System.out.println("\nInforme o codigo do deu cargo:");
		cargo = ler.nextInt();
		
		System.out.println("\nInforme seu nome :");
		nome = ler.next();
		
		System.out.println("\nInforme seu salario:");
		salario = ler.nextDouble();
		
		switch (cargo) {
		
		case 1: 
			salariof = (salario * 0.1) + salario;
			System.out.println("Colaborador: "+ nome +"\nCargo: Gerente \nNovo Salario: R$"+ salariof );
			break;
			
		case 2: 
			salariof = (salario * 0.07) + salario;
			System.out.println("Colaborador: "+ nome +"\nCargo: Vendedor \nNovo Salario: R$"+ salariof );
			break;
			
		case 3: 
			salariof = (salario * 0.09) + salario;
			System.out.println("Colaborador: "+ nome +"\nCargo: Supervisor \nNovo Salario: R$"+ salariof );
			break;
			
		case 4: 
			salariof = (salario * 0.06) + salario;
			System.out.println("Colaborador: "+ nome +"\nCargo: Motorista \nNovo Salario: R$"+ salariof );
			break;
			
		case 5: 
			salariof = (salario * 0.05) + salario;
			System.out.println("Colaborador: "+ nome +"\nCargo: Estoquista \nNovo Salario: R$"+ salariof );
			break;
			
		case 6: 
			salariof = (salario * 0.08) + salario;
			System.out.println("Colaborador: "+ nome +"\nCargo: Técnico de TI \nNovo Salario: R$"+ salariof );
			break;
		
		}
		
		ler.close();
		
}

}
