package ExerciciosLoops;

import java.util.Scanner;

/*
Desenvolva um gerador de tabuada,
capaz de gerar a tabuada de qualquer n�mero inteiro entre 1 a 10.
O usu�rio deve informar de qual numero ele deseja ver a tabuada.
A sa�da deve ser conforme o exemplo abaixo:
Tabuada de 5:
5 X 1 = 5
5 X 2 = 10
...
5 X 10 = 50
*/
public class Exer5_Tabuada {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = 0, tabuada = 0;
		System.out.println("De qual n�mero deseja ver a tabuada? ");
		num = scan.nextInt();
		do {
			System.out.println("N�mero inv�lido! Entre com n�mero entre 0 e 10: ");
			num = scan.nextInt();
		} while (num < 0 || num > 10);

		for (int i = 1; i <= 10; i++) {
			System.out.println(num + " x " + i + " = " + num * i);
		}
	}

}
