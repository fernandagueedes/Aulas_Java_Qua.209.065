package principal;

import java.util.Scanner;

import entities.Conta;

public class Program {

	public static void main(String[] args) {

		/*
		 * encapsulamento: consiste em esconder detalhes do usu�rio para acess�-los irei
		 * utilizar os metodos acessores get e set
		 */
		Scanner sc = new Scanner(System.in);
		Conta conta = new Conta();
		Conta conta2 = new Conta();

		// System.out.println(conta);
		// System.out.println(conta2);
		// System.out.println(conta);

		System.out.println("Titular: ");
		conta.setTitular(sc.nextLine());
		System.out.println("Agencia: ");
		conta.setAgencia(sc.nextInt());
		System.out.println("Numero da conta: ");
		conta.setNumeroConta(sc.nextInt());
		//System.out.println("Saldo: ");
		//conta.saldo = sc.nextDouble();

		System.out.println("Entre com o valor a depositar: ");
		double deposito = sc.nextDouble();

		// conta.setSaldo(60000);
		conta.depositar(deposito);

		System.out.println("Entre com o valor a sacar: ");
		double sacar = sc.nextDouble();

		conta.sacar(sacar);

		System.out.println("Saldo: " + conta.getSaldo());

		sc.close();

		sc.close();

	}

}
