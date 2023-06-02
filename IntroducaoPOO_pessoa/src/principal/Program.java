package principal;

import java.util.Scanner;

import entities.Pessoa;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		
		Pessoa pessoa4 = new Pessoa();
		Pessoa pessoa = new Pessoa();
		Pessoa pessoa2 = new Pessoa();
		Pessoa pessoa3 = new Pessoa();
		

		pessoa.nome = "Fernanda";
		pessoa.sexo = 'F';
		pessoa.idade = 32;

		pessoa2.nome = "Felipe";
		pessoa2.sexo = 'M';
		pessoa2.idade = 32;

		pessoa3.nome = "Maria";
		pessoa3.sexo = 'F';
		pessoa3.idade = 27; 

		System.out.print("Nome: ");
		pessoa4.nome = sc.nextLine();
		System.out.print("Ano do nascimento: ");
		//pessoa.retornaIdade(sc.nextInt());
		int ano = sc.nextInt();
		System.out.print("Sexo: ");
		pessoa4.sexo = sc.next().charAt(0);
		
		pessoa4.retornaIdade(ano);
		

		 System.out.println("Nome : " + pessoa.nome + ", " + pessoa.sexo + ", " + pessoa.idade);
		 System.out.println("Nome : " + pessoa2.nome + ", " + pessoa2.sexo + ", " + pessoa2.idade);
		 System.out.println("Nome : " + pessoa3.nome + ", " + pessoa3.sexo + ", " + pessoa3.idade);
		
		
		System.out.println("Nome: " + pessoa4.nome);
		System.out.println("Idade: " + pessoa4.idade);
		System.out.println("Sexo: " + pessoa4.sexo);
		
		sc.close();
	}

}
