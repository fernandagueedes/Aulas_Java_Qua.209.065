package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Fa�a um programa que entre com um ano e diga se ele � bissexto ou n�o
		 */
		
		Scanner leia = new Scanner (System.in);
		
		int ano;
		System.out.println("Informe um ano: ");
		ano = leia.nextInt();
		
		leia.close();
		
		if (ano %4 == 0 ) {
			System.out.println("O ano � bissexto!");
		} else {
			System.out.println("O ano n�o � bissexto!");
		}
		
	}

}
