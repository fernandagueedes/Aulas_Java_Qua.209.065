package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		
		/*Fa�a um programa que pe�a um n�mero e ent�o mostre a mensagem O numero informado foi [numero]
       
       */
		
		Scanner leia = new Scanner (System.in);
	    int numero;
	  
     
		System.out.println("Informe um n�mero: ");
		numero = leia.nextInt();
		
		System.out.println("O n�mero informado foi: " + numero);
		
		leia.close();
		
	}

}
