package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       /*Fa�a um programa que pergunte quanto voc� ganha por hora e o n�mero de horas trabalhadas no m�s. 
        * Calcule e mostre o total do seu sal�rio no referido m�s.
       
        */
		
		Scanner leia = new Scanner (System.in);
		
		int horasTrabalhadas;
		double valorHora;
		
		System.out.println("Quantas horas voc� trabalha no m�s? ");
		horasTrabalhadas = leia.nextInt();
		
		System.out.println("Quanto voc� recebe por hora? ");
		valorHora = leia.nextDouble();
		
		double resultado = (horasTrabalhadas * valorHora);
		
		System.out.println("O valor do seu sal�rio mensal �: R$ " + resultado);
		
		leia.close();
		
		
	}

}
