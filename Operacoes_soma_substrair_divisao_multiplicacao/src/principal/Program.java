package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		/*Faça um programa que receba o tipo de operação
		 *  a ser realizada (soma, divisão, multiplicação, subtração) 
		 * e imprima a tabuada desse número. ex.: 1x2 = 2, 1x3 = 3
		 */
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite um número para saber a tabuada: ");
		
		int numero = sc.nextInt();
		int i;

		System.out.println("Entre com o símbolo da operação: ");
		char operacao = sc.next().charAt(0);
		
		switch (operacao) {
		case '+':
			for (i = 1; i<= 10; i++) {
				System.out.println(i + " + " + numero + " = " + (i + numero));
			}
			break;
			
			
			case '-':
				int aux = numero;
				for (i = 1; i <= 10; i++) {
					System.out.println((aux + i) + " - " + (numero) + " = " + ((aux + i) - numero));
				}
				break;
			case '*':
				for (i = 1; i<= 10; i++) {
					System.out.println(i + " * " + numero + " = " + (i * numero));
				}
				break;
			case '/':
				for (i = 1; i<= 10; i++) {
					System.out.println((numero*i) + " / " + numero + " = " + (numero*i/numero));
				}
				break;
				
				

		default: System.out.println("A operação informada é inválida!");
			break;
		
		}
			
			
		  
		
			
	    
			
	    
	   
		sc.close();
	
	    
	    
			}
		
	
	}
	

