package principal;

import java.util.Scanner;

import entities.Conta;
import entities.ContaCorrente;
import entities.ContaPoupanca;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Herança possibilita que classes possam compartilhar atributos, métodos e demais membros da classe entre si
		 * há 2 tipos de herança: classe base (é o super classe, do construtor) e 
		 * classe derivada (herda caracteristicas da classe base)
		 * 
		*/
		
		
		Scanner sc = new Scanner(System.in);
		Conta contaPoupanca = new ContaPoupanca("Fernanda", 0123, 99000);
		Conta conta = new Conta("Maria", 3210, 00111);
		Conta contaCorrente = new ContaCorrente("João", 4567, 44555);
		
		contaPoupanca.depositar(500);
		conta.depositar(500);
		contaCorrente.depositar(500);
		
		contaPoupanca.sacar(50);
		conta.sacar(50);
		contaCorrente.sacar(50);
		
		System.out.println(contaPoupanca);
		System.out.println(conta);
		System.out.println(contaCorrente);
		
		
		/*System.out.println("Entre com o titular da conta: ");
		contaPoupanca.setNomeTitular(sc.nextLine());
		conta.setNomeTitular(sc.nextLine());
		
		
		System.out.println("Entre com o numero da conta: ");
		contaPoupanca.setNumeroConta(sc.nextInt());
		conta.setNumeroConta(sc.nextInt());
		
		
		System.out.println("Entre com o numero da agencia: ");
		contaPoupanca.setAgencia(sc.nextInt());
		conta.setAgencia(sc.nextInt());
		
		System.out.println("Entre com o valor do depósito: ");
		contaPoupanca.depositar(sc.nextDouble());
		conta.depositar(sc.nextDouble());
		
		
		System.out.println("Dados da conta: ");
		System.out.println("Conta Poupança: " + contaPoupanca);
		System.out.println("Conta: " + conta);
		
		
		System.out.println("Entre com o valor do saque: ");
		contaPoupanca.sacar(sc.nextDouble());
		conta.sacar(sc.nextDouble());
	
		
		System.out.println("Dados da conta: ");
		System.out.println("Conta Poupança: " + contaPoupanca);
		System.out.println("Conta: " + conta);
		*/
		
		sc.close();
	}

}
