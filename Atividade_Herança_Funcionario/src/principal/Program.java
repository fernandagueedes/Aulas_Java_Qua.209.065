package principal;

import java.util.Scanner;

import entities.Funcionario;
import entities.Gerente;
import entities.Secretaria;

public class Program {

	public static void main(String[] args) {
	
		/*Crie uma classe funcionário, e 2 classes filhas sendo gerente e secretaria; 
		 * os atributos da classe funcionário são: nome, idade, sexo, departamento, 
		 * e salario; gerente ganha uma bonificação de 500 reais e os 
		 * demais funcionários ganham uma bonificação de  150 reais por mês. mostre os dados dos funcionários e 
		 * seus respectivos salários acrescidos da bonificação;
		 */
		
		Scanner sc = new Scanner (System.in);
		Funcionario funcionario = new Funcionario("Fernanda", "Financeiro", 'F', 5000.00);
		Gerente gerente = new Gerente ("Ana", "Gerente RH", 'F', 4500.00);
		Secretaria secretaria = new Secretaria ("Maria", "Secretaria", 'F', 3500.00);
		
		System.out.println(funcionario);
		System.out.println();
		System.out.println(gerente);
		System.out.println();
		System.out.println(secretaria);
		
		
		
		
		
		
		
		
		sc.close();
	}

}
