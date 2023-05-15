package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Faça um programa que peça as 4 notas bimestrais e mostre a média.
		 
		 */
		
		Scanner leia = new Scanner (System.in);
		
		double nota1;
		double nota2;
		double nota3;
		double nota4;
		
		
		System.out.println("Informe a nota do primeiro bimestre: ");
		nota1 = leia.nextDouble();
		
		System.out.println("Informe a nota do segundo bimestre: ");
		nota2 = leia.nextDouble();
		
		System.out.println("Informe a nota do terceiro bimestre: ");
		nota3 = leia.nextDouble();
		
		System.out.println("Informe a nota do primeiro bimestre: ");
		nota4 = leia.nextDouble();
		
		
		double resultado = nota1 + nota2 + nota3 + nota4;
		double media = (resultado/4);
		
		System.out.println("A média das notas informadas é: " + media);
		
		leia.close();
		
		
		
		
	}

}
