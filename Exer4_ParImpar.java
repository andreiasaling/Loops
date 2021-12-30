package ExerciciosLoops;

import java.util.Scanner;

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/
public class Exer4_ParImpar {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int qtdNum = 0, impar = 0, par = 0, num = 0;

		System.out.println("Quantos números serão digitados? ");
		qtdNum = scan.nextInt();

		for (int i = 0; i < qtdNum; i++) {
			System.out.println("Digite um número: ");
			num = scan.nextInt();

			if (num % 2 == 0)
				par++;
			else
				impar++;
		}

		System.out.println("Foram digitados " + par + " números pares");
		System.out.println("Foram digitados " + impar + " números ímpares");
	}

}
