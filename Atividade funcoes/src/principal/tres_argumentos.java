package principal;

import java.util.Scanner;

public class tres_argumentos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Faça um programa, com uma função que necessite de três argumentos, e que
		 * forneça a soma desses três argumentos
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("Entre com o primeiro número da soma: ");
		int num1 = sc.nextInt();
		System.out.print("Entre com o segundo número da soma: ");
		int num2 = sc.nextInt();
		System.out.print("Entre com o terceiro número da soma: ");
		int num3 = sc.nextInt();

		somaDosNumeros(num1, num2, num3);

		sc.close();

	}

	static void somaDosNumeros(int x, int y, int z) {
		int resultado = x + y + z;
		System.out.println("O resultado da soma dos números informados é: " + resultado);
	}

}