package principal;

import java.util.Scanner;

import entities.Funcionario;
import entities.Gerente;
import entities.Secretaria;

public class Program {

	public static void main(String[] args) {
	
		/*Crie uma classe funcion�rio, e 2 classes filhas sendo gerente e secretaria; 
		 * os atributos da classe funcion�rio s�o: nome, idade, sexo, departamento, 
		 * e salario; gerente ganha uma bonifica��o de 500 reais e os 
		 * demais funcion�rios ganham uma bonifica��o de  150 reais por m�s. mostre os dados dos funcion�rios e 
		 * seus respectivos sal�rios acrescidos da bonifica��o;
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
