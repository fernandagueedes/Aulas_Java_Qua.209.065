package principal;

import java.util.Scanner;

import entities.Triangulo;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner (System.in);
		
		Triangulo triangulo = new Triangulo();
		
		System.out.print("Entre com o lado 1 do tri�ngulo: ");
		double lad1= sc.nextDouble();
		
		System.out.print("Entre com o lado 2 do tri�ngulo: ");
		double lad2= sc.nextDouble();
		
		System.out.print("Entre com o lado 3 do tri�ngulo: ");
		double lad3= sc.nextDouble();
		
		triangulo.retornaTriangulo(lad1, lad2, lad3); 
		
		sc.close();		
		
	}

}
