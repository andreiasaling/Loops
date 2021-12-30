package ExerciciosLoops;

import java.util.Scanner;

/*
Fa�a um programa que calcule o fatorial de um n�mero inteiro fornecido pelo usu�rio.
Ex.: 5!= 120 (5 X 4 X 3 X 2 X 1)
*/
public class Exer6_Fatorial {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num, fatorial = 1;

		System.out.println("Digite um n�mero para saber seu fatorial: ");
		num = scan.nextInt();

		for (int i = num; i >= 1; i--) {
			fatorial = fatorial * i;
		}
		System.out.println(num + " ! = " + fatorial);
	}

}
