package principal;

import java.util.Scanner;

import entities.AreaTerreno;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner (System.in);
		
		AreaTerreno area = new AreaTerreno(); //para acessar a classe que foi criada, no caso desta é a Area.Terreno
		
		System.out.print("Entre com o valor da largura: ");
		double largura= sc.nextDouble();
		
		System.out.print("Entre com o valor do comprimento: ");
		double comprimento = sc.nextDouble();
		
		area.retornaArea(largura, comprimento);
		System.out.println("A area do terreno é: " + area.area );
		
		sc.close();
	}

}
