package principal;

import java.util.Scanner;

public class tres_argumentos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Fa�a um programa, com uma fun��o que necessite de tr�s argumentos, e que
		 * forne�a a soma desses tr�s argumentos
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("Entre com o primeiro n�mero da soma: ");
		int num1 = sc.nextInt();
		System.out.print("Entre com o segundo n�mero da soma: ");
		int num2 = sc.nextInt();
		System.out.print("Entre com o terceiro n�mero da soma: ");
		int num3 = sc.nextInt();

		somaDosNumeros(num1, num2, num3);

		sc.close();

	}

	static void somaDosNumeros(int x, int y, int z) {
		int resultado = x + y + z;
		System.out.println("O resultado da soma dos n�meros informados �: " + resultado);
	}

}