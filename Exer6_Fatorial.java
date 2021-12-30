package ExerciciosLoops;

import java.util.Scanner;

/*
Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
Ex.: 5!= 120 (5 X 4 X 3 X 2 X 1)
*/
public class Exer6_Fatorial {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num, fatorial = 1;

		System.out.println("Digite um número para saber seu fatorial: ");
		num = scan.nextInt();

		for (int i = num; i >= 1; i--) {
			fatorial = fatorial * i;
		}
		System.out.println(num + " ! = " + fatorial);
	}

}
