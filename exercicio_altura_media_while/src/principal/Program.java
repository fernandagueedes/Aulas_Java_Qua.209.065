package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		/*
		 * Faça um programa usando laço de repetição while
		 *  que leia a altura de 5 pessoas e mostre a media de altura
		 * entre elas;
		 */
        
		Scanner sc = new Scanner (System.in);
		
		double somaAltura = 0;
		double altura = 0;
		int contador = 0;
		
		while (contador <5) {
			System.out.print("Insira a altura: ");
			contador++;
			altura = sc.nextDouble();
			System.out.println(contador);
			somaAltura += altura;
			
		}
		System.out.println(contador);
		System.out.println("A média das alturas é: " + (somaAltura/ contador));
				
		
		
		sc.close();
		
		
		
		
		
	}

}
