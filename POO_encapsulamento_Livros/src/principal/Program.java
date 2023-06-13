package principal;

import java.util.Scanner;

import entities.Livro;

public class Program {

	public static void main(String[] args) {
		/*
		 * Crie uma classe Livro onde seja obrigat�rio a inser��o do nome, edi��o e
		 * valor do livro. Caso o livro ultrapasse o valor de 100 reais, adicione uma
		 * taxa de 30% de imposto, voc� n�o poder� criar um m�todo especifico para isso,
		 * apenas os m�todos get e set j� existentes. Mostre os dados do livro
		 * cadastrado.
		 */

		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Entre com o nome do livro: ");
		String nomeLivro = sc.nextLine();

		System.out.print("Entre com a edi��o do livro: ");
		int edicao = sc.nextInt();

		System.out.print("Entre com o valor do livro: R$ ");
		double valor = sc.nextInt();
		
		
		Livro livro = new Livro (nomeLivro, edicao, valor);
		livro.setValor(valor);
		
		
		System.out.println(livro);

		sc.close();

	}

}
