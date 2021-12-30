package ExerciciosLoops;

/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/

import java.util.Scanner;

public class Exer3_MaiorEMedia {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int num, maior = 0, media = 0, i = 0;

		do {
			System.out.println("Digite um número: ");
			num = scan.nextInt();
			if (num > maior)
				maior = num;
			media += num;
			i++;
		} while (i < 5);

		System.out.println("O maior número digitado foi: " + maior);
		media = media / 5;
		System.out.println("A média entre os números digitados é: " + media);

	}

}
