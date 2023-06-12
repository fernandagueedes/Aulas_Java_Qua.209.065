package principal;

import java.util.Scanner;

import entities.Produto;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Produto produto = new Produto();

		System.out.print("Entre com o nome do produto: ");
		produto.setDescricao(sc.nextLine());

		System.out.print("Entre com a quantidade a ser adicionada: ");
		produto.adicionaProduto(sc.nextInt());

		System.out.print("Entre com o valor unitário: ");
		produto.setPreco(sc.nextDouble());

		System.out.println(produto);
		
		System.out.println("Quantidade a ser removida: ");
		produto.removeProduto(sc.nextInt());
		
		System.out.println(produto);
		
		sc.close();

	}

}
