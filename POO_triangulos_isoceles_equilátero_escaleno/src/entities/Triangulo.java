package entities;

public class Triangulo {

	// Fa�a um programa que receba 3 valores que representam um triangulo, a partir
	// desses valores, recebidos retorne
	// se � um triangulo is�sceles, equil�tero, escaleno.

	public double triangulo;

	public void retornaTriangulo(double lad1, double lad2, double lad3) {
      if((lad1 == lad2 && lad2 == lad3)){
    	  System.out.println("O Triangulo � equil�tero!");
    	  
      }
      else if((lad1 != lad2 && lad1 != lad3 && lad2 != lad3 )) {
    	  System.out.println("O triangulo � escaleno!");
      }
      else {
    	  System.out.println("O triangulo � isoceles!");
      }
	}
}
