package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Fa�a um programa que pe�a a temperatura em graus Celsius, transforme e mostre em graus Fahrenheit.
		 C= 5*((F-32)/9).
		 
		 */
		
        Scanner leia = new Scanner (System.in);
		
		
		double celsius;
		
		System.out.println("Informe a temperatura em graus Celsius: ");
		celsius = leia.nextDouble();
		
		double  resultado = (1.8 * celsius + 32);
		
		System.out.println("A temperatura informada em Graus Fahrenheit �: " + resultado);
		
		
		leia.close();
	}

}
