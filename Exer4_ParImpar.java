package ExerciciosLoops;

import java.util.Scanner;

/*
Fa�a um programa que pe�a N n�meros inteiros,
calcule e mostre a quantidade de n�meros pares
e a quantidade de n�meros impares.
*/
public class Exer4_ParImpar {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int qtdNum = 0, impar = 0, par = 0, num = 0;

		System.out.println("Quantos n�meros ser�o digitados? ");
		qtdNum = scan.nextInt();

		for (int i = 0; i < qtdNum; i++) {
			System.out.println("Digite um n�mero: ");
			num = scan.nextInt();

			if (num % 2 == 0)
				par++;
			else
				impar++;
		}

		System.out.println("Foram digitados " + par + " n�meros pares");
		System.out.println("Foram digitados " + impar + " n�meros �mpares");
	}

}
