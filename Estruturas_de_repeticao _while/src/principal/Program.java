package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * O fOR É utilizado quando sabemos a quantidade de vezes que irá repetir
		 * 
		 */

		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		System.out.println("___________________________________");

		/*
		 * while é um laço de repetição que significa "enquanto" O while É utilizado
		 * quando NÃO sabemos a quantidade de vezes que irá repetir
		 * o while se não atender a condição ele não continua o laço de repetição
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
		
		/* do while É um laço de repetição que significa "faça enquanto", 
		* ou seja, "faça" do {bloco de código } "enquanto" while {bloco de código}
		garante que será executado o bloco de códigos ao menos 1 vez;
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
