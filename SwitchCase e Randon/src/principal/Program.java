package principal;

import java.util.Random;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Usamos o comando Switch para opções "pré-definidas" da minha variável o que
		 * está na minha String será o que irá aparecer quando usar o if, else if, else
		 * e o == não funcionar, use o nomedavariavel.equal no exemplo abaixo o nome da
		 * variável é opcao, logo, uso opcao.equals
		 * 
		 * O Random é uma biblioteca que gera um numero aleatorio podem ser utilizados para gerar senhas, 
		 * ou texto do campo captcha, ou qualquer outro numero aleatorio.
		 * 
		 */

		Random randon = new Random();

		int opcao = randon.nextInt(8) + 1;
		System.out.println(opcao);

		switch (opcao) {
		case 1:
             System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda");
			break;
		case 3:
			System.out.println("Terça");
			break;
		case 4:
			System.out.println("Quarta");
			break;
		case 5:
			System.out.println("Quinta");
			break;
		case 6: 
			System.out.println("Sexta");
			break;
		case 7:
			System.out.println("Sábado");
            break;


		default:
			System.out.println("Não corresponde a um dia da semana");
			break;
		}
		{
		}

		/*
		 * switch (opcao) { case "Quarta-feira":
		 * System.out.println("O dia selecionado é Quarta-feira"); break; case
		 * "Quinta-feira": System.out.println("O dia selecionado é Quinta-feira");
		 * break; case "Sexta-feira": System.out.println("Sextou!!!"); break;
		 * 
		 * default: System.out.println("Não corresponde a um dia da semana!"); break; }
		 * 
		 * if (opcao.equals "Quarta-feira") {
		 * System.out.println("O dia selecionado é quarta-feira!"); } else if
		 * (opcao.equals "Sexta-feira") { System.out.println("Sextou!"); } else {
		 * System.out.println("Não corresponde a um dia da semana!");
		 */

	}
}
