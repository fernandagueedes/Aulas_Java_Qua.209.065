package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * O fOR � utilizado quando sabemos a quantidade de vezes que ir� repetir
		 * 
		 */

		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		System.out.println("___________________________________");

		/*
		 * while � um la�o de repeti��o que significa "enquanto" O while � utilizado
		 * quando N�O sabemos a quantidade de vezes que ir� repetir
		 * o while se n�o atender a condi��o ele n�o continua o la�o de repeti��o
		 */
		int i = 0;
		while (i < 10) {
			System.out.println(i);
			i++;
		}

		Scanner sc = new Scanner(System.in);

		System.out.print("Deseja continuar? ");
		char opcao = sc.next().charAt(0);
		int j = 0;
		while (opcao == 's') {
			j++;
			System.out.print("Deseja continuar? ");
			opcao = sc.next() .charAt(0);
		}
		System.out.println("Entrou no while: " + j);
		
		/* do while � um la�o de repeti��o que significa "fa�a enquanto", 
		* ou seja, "fa�a" do {bloco de c�digo } "enquanto" while {bloco de c�digo}
		garante que ser� executado o bloco de c�digos ao menos 1 vez;
		* para aceitar o caractere minusculo ou maiusculo use Character.toUpperCase(opcao) == 'S')
		*/
		
		int k = 0;
		do { 
			System.out.print("Deseja continuar? ");
			opcao = sc.next() .charAt(0);
			k++;
		}while(Character.toUpperCase(opcao) == 'S'); 
		System.out.println("Entrou no do while: " + k);
		sc.close();

	}
}
