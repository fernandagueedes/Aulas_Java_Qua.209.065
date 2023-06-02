package entities;

public class Triangulo {

	// Faça um programa que receba 3 valores que representam um triangulo, a partir
	// desses valores, recebidos retorne
	// se é um triangulo isósceles, equilátero, escaleno.

	public double triangulo;

	public void retornaTriangulo(double lad1, double lad2, double lad3) {
      if((lad1 == lad2 && lad2 == lad3)){
    	  System.out.println("O Triangulo é equilátero!");
    	  
      }
      else if((lad1 != lad2 && lad1 != lad3 && lad2 != lad3 )) {
    	  System.out.println("O triangulo é escaleno!");
      }
      else {
    	  System.out.println("O triangulo é isoceles!");
      }
	}
}
