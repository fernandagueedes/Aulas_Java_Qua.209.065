package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Faça um programa que leia a altura de 5 pessoas e mostre a media de altura
		 * entre elas;
		 */

		Scanner sc = new Scanner(System.in);
        
		double somaAltura = 0;
	    double altura = 0;
	    
	    for (int contador = 1; contador <=5; contador++ ) {
	    	System.out.print("Insira a altura: ");
	    	altura = sc.nextDouble();
	    	somaAltura += altura;
	    }
	    
	    System.out.println("A média das alturas é: " + (somaAltura / 5));
	   
	    
	    
	    
	    
	    /*Faça um programa onde o 1 é sim e 0 é não, toda vez que for sim entre 
	     * em um bloco de código e some mais 1 a uma variável contadora
	     */   
	
		sc.close();
		
	}

}
