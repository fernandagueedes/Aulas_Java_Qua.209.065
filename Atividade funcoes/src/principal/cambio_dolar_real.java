package principal;

import java.util.Scanner;

public class cambio_dolar_real {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        /*Fa�a um programa que receba um valor em real e converta para d�lares na cota��o
         *atual, fa�a o inverso tamb�m. 
         */
		
		Scanner sc = new Scanner (System.in);
		
		double valorEmReais;
		double taxaDeCambio = 5.20;
		
		
		System.out.print("Digite o valor em reais para convert�-lo para Dolar: ");
		valorEmReais = sc.nextDouble();
		
		cambioDolar(valorEmReais, taxaDeCambio);
		
		double valorEmDolar;
		
		
		System.out.print("Digite o valor em D�lar para convert�-lo para REAIS: ");
		valorEmDolar = sc.nextDouble();
		
		cambioReais(valorEmDolar, taxaDeCambio);
		
		
		sc.close();
		
	}

	 static void cambioDolar(double x, double y ) { double cambioDolar = x/y;
	  System.out.println("O valor R$ " + x + " convertido para Dol�r �: " + cambioDolar);
}
	 static void cambioReais (double y, double x) { double cambioReais = y * x;
	 System.out.println("o valor em D�lar" + y + " convertido para REAIS � R$ " + cambioReais);
		 
	 }
}