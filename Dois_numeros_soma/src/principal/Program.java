package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       /* Fa�a um programa que pe�a dois n�meros e imprima a soma;
        
        */
		
		Scanner leia = new Scanner (System.in);
		
		int numero1;
		int numero2;
		
		
		System.out.println("Informe um n�mero: ");
		numero1 = leia.nextInt();
		
		System.out.println("Informe outro n�mero: ");
		numero2 = leia.nextInt();
		
		
		int resultado = numero1 + numero2;
		
		System.out.println("A soma dos dois n�meros informados �: " + resultado);
		
	}

}
