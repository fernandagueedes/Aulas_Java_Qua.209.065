package principal;

import entities.Carro;

public class Program { 

	public static void main(String[] args) {
		
		/*programa��o orientada a objetos � trazer o mundo real pro mundo da programac�o */
		
		Carro carro = new Carro();
		Carro carro2 = new Carro();
		
		carro.modelo = "celta";
		carro.ano = 2022;
		carro.cor = "vermelho";
		
		carro2.ano = 2023;
		carro2.modelo = "corola";
		carro2.cor = "azul";
		
		System.out.println("Carro : " +carro.ano + " " + carro.modelo);
		System.out.println("Carro 2: " + carro2.ano + " " + carro2.modelo);
		

		
		

	}

}
