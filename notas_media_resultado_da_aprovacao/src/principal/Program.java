package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Fa�a um programa que leia 4 notas de aluno e retorne a m�dia, se m�dia maior que 5 e menor que 6 REPROVADO,
		 * se m�dia entre 6 e 7 RECUPERA��O, se m�dia acima de 7 APROVADO, se m�dia 10 APROVADO COM HONRAS.
		 */
		
		Scanner leia = new Scanner (System.in);
		
		double nota1;
		double nota2;
		double nota3;
		double nota4;

		System.out.print("Informe a nota do primeiro bimestre: ");
        nota1 = leia.nextDouble();

		System.out.print("Informe a nota do segundo bimestre: ");
        nota2 = leia.nextDouble();

        System.out.print("Informe a nota do terceiro bimestre: ");
        nota3 = leia.nextDouble();

		System.out.print("Informe a nota do quarto bimestre: ");
		nota4 = leia.nextDouble();

		leia.close();

		double media = ((nota1 + nota2 + nota3 + nota4)/4);

		System.out.println("A m�dia das notas informadas �: " + media);

		
        if (media <6) {

			System.out.println("REPROVADO" );

		} if ((media >=6) && (media <7)) {

			System.out.println ("RECUPERA��O" );

		} if ((media >=7) && (media <10)) {

			System.out.println ("APROVADO" );

		} if (media == 10) {

			System.out.println("APROVADO COM HONRAS!");
		}
	}

}
