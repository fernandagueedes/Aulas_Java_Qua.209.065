package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		/*Faça um programa que leia 3 números e mostre o maior deles;
		 */
		
		Scanner leia = new Scanner (System.in);
		
		int numero1;
		int numero2;
		int numero3;
		
		System.out.println("Digite o primeiro número: ");
		numero1 = leia.nextInt();
		
		System.out.println("Digite o segundo número: ");
		numero2 = leia.nextInt();
		
		System.out.println("Digite o terceiro número: ");
		numero3 = leia.nextInt();
		
		leia.close();
		
		if ((numero1 > numero2) && (numero1 > numero3)) {
			System.out.println("o maior número é: " + numero1);
		}	
		if ((numero2 > numero1) && (numero2 > numero3)) {
			System.out.println("o maior número é: " + numero2);
		}
		if ((numero3 > numero1) && (numero3 > numero2)) {
			System.out.println("o maior número é: " + numero3);
		}
	}

}
