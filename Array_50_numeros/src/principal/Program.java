package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Fa�a um programa que receba 50 n�meros, mostre os n�meros pares contidos em cada posi��o
		 * (indice) do vetor;
		 */
		
		Scanner sc = new Scanner (System.in);
		
		int [] vetor = new int[50];
		
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Entre com o n�mero " + (i + 1) + " : ");
			int numero = sc.nextInt();
			vetor[i] = numero;
		}
		for(int i = 0; i<vetor.length; i++) {
			if(vetor[i]% 2 == 0 ){
				System.out.println("N�mero: " + vetor[i] + ", posi��o do vetor: " + i);
				
		}
		
			
			
				
				sc.close();
				
			}
			
			
	}
}