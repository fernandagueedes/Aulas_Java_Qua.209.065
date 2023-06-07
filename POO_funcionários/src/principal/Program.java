package principal;

import java.util.Scanner;

import entities.Funcionario;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Funcionario funcionario = new Funcionario();

		System.out.print("Entre com o nome do funcionario: ");
		funcionario.nome = sc.nextLine();

		System.out.print("Entre com o cargo: ");
		funcionario.cargo = sc.nextLine();

		System.out.print("Entre com o salário: ");
		funcionario.salario = sc.nextDouble();

		
		funcionario.verificaComissao();

		System.out.println("Funcionário : " + funcionario.nome);
		System.out.println("Cargo: " + funcionario.cargo);
		System.out.println("Salário atualizado: " + funcionario.salario);

		sc.close();
	}

}
