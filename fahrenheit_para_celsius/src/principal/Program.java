package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Fa�a um programa que pe�a a temperatura em graus Fahrenheit, transforme e mostre a temperatura em graus Celsius.
		  C=5*((F-32)/9).
		 
		 
		 */
		
		Scanner leia = new Scanner (System.in);
		
		
		double fahrenheit;
		
		System.out.println("Informe a temperatura em graus Fahrenheit: ");
		fahrenheit = leia.nextDouble();
		
		double resultado = 5*((fahrenheit-32)/9);
		
		System.out.println("A temperatura informada em Graus Celsius �: " + resultado);
		
		leia.close();
		
	}

}
