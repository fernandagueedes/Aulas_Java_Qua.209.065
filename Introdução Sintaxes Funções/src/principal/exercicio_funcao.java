package principal;

import java.util.Scanner;

public class exercicio_funcao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre com o primeiro número da soma: ");
		int numero1 = sc.nextInt();
		System.out.print("Entre com o segundo número da soma: ");
		int numero2 = sc.nextInt();
		
		somaDoisNumeros(numero1, numero2);
		System.out.println("Abaixo os números foram atribuídos manualmente");
		System.out.println();
		System.out.println();
		
		somaDoisNumeros(10, 20);
		System.out.println();
		System.out.println();
		
		int num1 = 15;
		int num2 = 45;
		System.out.println(mensagem5(num1,num2));
		System.out.println();
		System.out.println();
		
		somaDoisNumeros(num1,num2);
		
	}

	static String mensagem5(int x, int y) {
		return "A soma dos dois números informados é: " + (x + y);
	}

	
	 static void somaDoisNumeros(int x, int y) { int resultado = x + y;
	  System.out.println("O resultado da soma é: " + resultado);
	  System.out.println("Outra forma de mostrar o resultado da soma: " + (x+y));
	  }
	 
	
}
