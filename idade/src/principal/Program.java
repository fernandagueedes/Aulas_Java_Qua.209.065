package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Fa�a um aplicativo que receba o ano de nascimento e o ano atual e mostre na tela sua idade
		 
		 */
		
		Scanner leia = new Scanner (System.in);
		
		int anoNascimento;
		int anoAtual;
		
		System.out.println("Informe seu ano de nascimento: ");
		anoNascimento = leia.nextInt();
		
		
		System.out.println("Informe o ano atual: ");
		anoAtual = leia.nextInt();
		
		int idade = (anoAtual - anoNascimento);
		
		System.out.println("Sua idade �: " + idade);
		idade = leia.nextInt();
		
		leia.close();
		
	}

}
