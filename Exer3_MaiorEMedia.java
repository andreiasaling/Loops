package ExerciciosLoops;

/*
Fa�a um programa que leia 5 n�meros
e informe o maior n�mero
e a m�dia desses n�meros.
*/

import java.util.Scanner;

public class Exer3_MaiorEMedia {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int num, maior = 0, media = 0, i = 0;

		do {
			System.out.println("Digite um n�mero: ");
			num = scan.nextInt();
			if (num > maior)
				maior = num;
			media += num;
			i++;
		} while (i < 5);

		System.out.println("O maior n�mero digitado foi: " + maior);
		media = media / 5;
		System.out.println("A m�dia entre os n�meros digitados �: " + media);

	}

}
