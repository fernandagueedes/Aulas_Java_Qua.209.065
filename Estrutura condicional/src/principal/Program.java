package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero1 = 10;
		int numero2 = 25;
		boolean bool = false;

		/*
		 * o if significa "se", e a chave no final delimita o meu if, ou seja, o meu
		 * comando if terminou. o else significa "se n�o" o boolean retorna "verdadeiro"
		 * ou "falso" quando eu nego a minha vari�vel ela muda o valor (como na tabela
		 * verdade) ex: a variavel bool = false para negar a variavel usa : !bool = true
		 * ! = nega��o da vari�vel
		 */

		if (numero1 > numero2) {
			System.out.println("n�mero 1 � o maior");
		} else {
			System.out.println("n�mero 2 � o maior");

		}
		if (bool == false) {
			System.out.println("Verdadeiro");
		} else {
			System.out.println("Falso");

		}

		// Exemplo usando resto da divis�o para saber se � impar ou par

		Scanner leia = new Scanner(System.in);

		int numero;

		System.out.println("Entre com um n�mero para saber se � par ou �mpar");
		numero = leia.nextInt();

		leia.close();
		if (numero % 2 == 0) {
			System.out.println("n�mero par!");
		} else {
			System.out.println("n�mero �mpar!");
		}

	}

}
