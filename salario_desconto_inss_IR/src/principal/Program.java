package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Fa�a um programa que receba o salario base de um funcion�rio (salario bruto) 
		  fa�a o desconto de inss 5% e IR 11% mostre o valor dos descontos, e o valor do salario liquido;
		 */
		
		Scanner leia = new Scanner (System.in);
		
		
		double salarioBruto;
		
		System.out.print("Informe o valor do sal�rio bruto: ");
		salarioBruto = leia.nextDouble();
		
		double inss = (0.05 * salarioBruto);
		double ir = (0.11 * salarioBruto);
		double salarioLiquido = ((salarioBruto)- (inss + ir));
		
		
		System.out.println("Desconto INSS:R$ " + inss);
		
		System.out.println("Desconto IR:R$ " + ir);
		
		System.out.println("O valor do sal�rio l�quido �:R$ " + salarioLiquido);
		
		
		leia.close();
		
		
		
	}

}
