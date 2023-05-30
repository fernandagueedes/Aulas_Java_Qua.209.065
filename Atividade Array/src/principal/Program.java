package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Faça um programa que recebe a nota do aluno e as quatro notas bimestrais
		 * desse aluno e mostre a média;
		 */

		double nota[] = new double[4];
		double media = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Qual o nome do(a) aluno(a)? ");
		String nomeAluno = sc.nextLine();

		for (int contador = 0; contador < nota.length; contador++) {
			System.out.print("Entre com a nota " + (contador + 1) + ": " );
			nota[contador] = sc.nextDouble();
			media = media + nota[contador];
		}
		System.out.println("A média do(a) aluno(a) " + nomeAluno + " é: " + (media / nota.length));

		sc.close();

	}
}
