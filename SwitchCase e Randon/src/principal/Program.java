package principal;

import java.util.Random;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Usamos o comando Switch para op��es "pr�-definidas" da minha vari�vel o que
		 * est� na minha String ser� o que ir� aparecer quando usar o if, else if, else
		 * e o == n�o funcionar, use o nomedavariavel.equal no exemplo abaixo o nome da
		 * vari�vel � opcao, logo, uso opcao.equals
		 * 
		 * O Random � uma biblioteca que gera um numero aleatorio podem ser utilizados para gerar senhas, 
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
			System.out.println("Ter�a");
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
			System.out.println("S�bado");
            break;


		default:
			System.out.println("N�o corresponde a um dia da semana");
			break;
		}
		{
		}

		/*
		 * switch (opcao) { case "Quarta-feira":
		 * System.out.println("O dia selecionado � Quarta-feira"); break; case
		 * "Quinta-feira": System.out.println("O dia selecionado � Quinta-feira");
		 * break; case "Sexta-feira": System.out.println("Sextou!!!"); break;
		 * 
		 * default: System.out.println("N�o corresponde a um dia da semana!"); break; }
		 * 
		 * if (opcao.equals "Quarta-feira") {
		 * System.out.println("O dia selecionado � quarta-feira!"); } else if
		 * (opcao.equals "Sexta-feira") { System.out.println("Sextou!"); } else {
		 * System.out.println("N�o corresponde a um dia da semana!");
		 */

	}
}
