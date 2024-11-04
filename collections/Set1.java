package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Set1 {

	public static void main(String[] args) {

		HashSet<Integer> numeros = new HashSet<Integer>();

		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {

			System.out.println("Digite um numero : ");
			numeros.add(scanner.nextInt());

		}

		Iterator<Integer> numeros1 = numeros.iterator();

		while (numeros1.hasNext()) {
			System.out.println(numeros1.next());
		}

	}

}
