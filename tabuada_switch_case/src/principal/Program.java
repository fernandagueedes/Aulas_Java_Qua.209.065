package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		/*Fa�a um programa que receba o tipo de opera��o
		 *  a ser realizada (soma, divis�o, multiplica��o, subtra��o) 
		 * e imprima a tabuada desse n�mero. ex.: 1x2 = 2, 1x3 = 3
		 */
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite um n�mero para saber a tabuada: ");
		
		int numero = sc.nextInt();
		int i;

		System.out.println("Entre com o s�mbolo da opera��o: ");
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
				
				

		default: System.out.println("A opera��o informada � inv�lida!");
			break;
		
		}
			
			
		  
		
			
	    
			
	    
	   
		sc.close();
	
	    
	    
			}
		
	
	}
	

