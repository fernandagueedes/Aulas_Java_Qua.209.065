package principal;

import java.util.Scanner;

public class valor_produto_valor_lucro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        /* Faça um programa com uma função que recebe dois parâmetros (valorDoProduto, lucroProduto) 
         * os produtos a serem vendidos recebem o preço de custo e retorna o valor com uma porcentagem aplicada de lucro, 
         * por exemplo: 
         * se um produto custa 10,00 e é aplicada uma taxa de 10 % de lucro, 
         * o produto será vendido por 11,00;
         */
		
		Scanner sc = new Scanner (System.in);
		
		double valorDoProduto;
		double lucroProduto;
		
		System.out.print("Entre com o valor do produto : R$ ");
		valorDoProduto = sc.nextDouble();
		
		System.out.print("Entre com o valor do lucro %: "  );
		lucroProduto = sc.nextDouble();
		
		System.out.println();
		double auxLucro = (lucroProduto /100);
		
		valorVendido (valorDoProduto, auxLucro);
		
		
		sc.close();
		
		
	}
    
	static void valorVendido(double x, double y) {
		double valorVendido = (x + (x * y));
		System.out.println("O produto informado calculando " + y*100 + "% de lucro, deve ser vendido por: R$ " + valorVendido);
}
}