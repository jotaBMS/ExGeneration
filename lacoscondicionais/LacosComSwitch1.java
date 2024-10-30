/*escreva um algoritmo em Java que leia o código de um item 
 * (número inteiro de 1 a 6) e a quantidade comprada deste item (número inteiro). 
 * A seguir, mostre na tela o valor total da conta e o nome do produto que foi comprado.

*/

package lacoscondicionais;

import java.util.Scanner;

public class LacosComSwitch1 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int produto, quant, valort;
		int v1=10, v2=15, v3=18, v4=12, v5=8, v6=13;
		
		System.out.println("                CATALOGO DE PRODUTOS                  ");
		System.out.println(" -  Cod.Prod.    -     Produto     -       Valor      ");
		System.out.println(" -     1    -     Cachorro Quente  -       R$ 10.00   ");
		System.out.println(" -     2    -     X-Salada         -       R$ 15.00   ");
		System.out.println(" -     3    -     X-Bacon          -       R$ 18.00   ");
		System.out.println(" -     4    -     Bauru            -       R$ 12.00   ");
		System.out.println(" -     5    -     Refrigerante     -       R$ 8.00    ");
		System.out.println(" -     6    -     Suco de laranja  -       R$ 13.00   ");
		
		System.out.println("\n\nqual o codigo do produto que deseja?");
		produto = ler.nextInt();
		
		System.out.println("\nqual a quantidade desejada?");
		quant = ler.nextInt();
		
				
		switch (produto) {
		
		case 1: 
			valort = quant * v1;
			System.out.println("Suas(s) "+ quant +" unidades de Cachorro Quente deu um total de R$ "+ valort +".00");
			break;
			
		case 2: 
			valort = quant * v2;
			System.out.println("Suas(s) "+ quant +" unidades de X-Salada deu um total de R$ "+ valort +".00");
			break;
			
		case 3: 
			valort = quant * v3;
			System.out.println("Suas(s) "+ quant +" unidades de X-Bacon deu um total de R$ "+ valort +".00");
			break;
			
		case 4: 
			valort = quant * v4;
			System.out.println("Suas(s) "+ quant +" unidades de Bauru deu um total de R$ "+ valort +".00");
			break;
			
		case 5: 
			valort = quant * v5;
			System.out.println("Suas(s) "+ quant +" unidades de Refrigerante deu um total de R$ "+ valort +".00");
			break;
			
		case 6: 
			valort = quant * v6;
			System.out.println("Suas(s) "+ quant +" unidades de Suco de laranja deu um total de R$ "+ valort +".00");
		}
		
		ler.close();
		
	}

}
