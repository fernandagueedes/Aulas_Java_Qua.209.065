package principal;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// uma constante � quando o seu valor n�o muda
		final double PI = 3.1415;

		// realiza a potencia o primeiro numero � a base e o segundo � a potencia
		System.out.println(Math.pow(2, 2));

		// passagem de 2 numeros como parametro retorna o maior deles
		System.out.println(Math.max(5, 20));

		// � o inverso do max, ou seja, retorna o m�nimo na passagem de 2 valores
		System.out.println(Math.min(5, 20));
        
		
		//retorna a raiz quadrada de um numero
		System.out.println(Math.sqrt(81));
		
		//arredonda o numero (para mais ou para menos)
		System.out.println(Math.round(25.6578));
		
		//podemos realizar calculos com valores retornados pelo calculo de Math.
		System.out.println(2 + Math.sqrt(18));
		
		
		Scanner leia = new Scanner (System.in);
		Locale ponto = new Locale ("en", "us");
		
		//System.out.println("Entre com o valor do dolar: ");
		//double dolar = leia.useLocale(ponto).nextDouble();
		
		//System.out.println("Valor dolar digitado: " + dolar);
		
		String nome = "Fernanda Guedes";
		char sexo = 'F';
		int idade = 32;
		double altura = 1.588888414;
		
		
		//o printf serve para formatar, ou seja, quando eu coloco %s leia uma String, %c leia uma char, 
		//%d leia um inteiro, % f leia um double. %.2f mostra apenas duas casas decimais no double e arredonda o valor.
		System.out.printf("O meu nome � %s, sou do sexo %c, tenho %d anos, minha altura �: %.2f", nome, sexo, idade, altura);
		
		/*
		 * operadores de compara��o
		 * > maior que
		 * < menor que
		 * >= maior ou igual a 
		 * <= menor ou igual a 
		 * != diferente de
		 * == igual a 
		 */
		 /* operadores l�gicos
		  * && = e
		  * || = ou
		  * ! = nega��o
		  */
		
		
		
		
		
		leia.close();
		
		
		
	}

}
