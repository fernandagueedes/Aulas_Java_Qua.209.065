package principal;

import java.util.Random;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Fa�a um programa para gerar 3 n�meros aleat�rios para 3 dados, 
		 * mostre a soma dos n�meros que sa�ram. Se 2 dados sa�rem com a mesma numera��o o jogador ganha 2 pontos de b�nus,
		 *  se os 3 dados sa�rem com a mesma numera��o ele ganha 6 pontos de b�nus 
		 *  e deve aparecer a mensagem "voc� � muito sortudo". 
		 *  Se o total da soma dos dados mais o b�nus for menor que 15 o jogador perde 
		 *  e apresenta a mensagem "Lamento, mas voc� perdeu", 
		 *  se for maior ou igual a 15 ele ganha e apresenta a mensagem "parab�ns, voc� ganhou!"
		 */
		
		
		Random randon = new Random();
		
		int dado1 = randon.nextInt(6) + 1;
		System.out.println("Dado 1: " + dado1);
		
		int dado2 = randon.nextInt(6) + 1;
		System.out.println("Dado 2: " + dado2);
		
		int dado3 = randon.nextInt(6) + 1;
		System.out.println("Dado 3: " + dado3);
        
		int somaDados = (dado1 + dado2 + dado3);
		
		System.out.println("A soma dos dados �: " + somaDados);		
		
		if (dado1 == dado2 || dado2 == dado3 || dado1 == dado3) {
		
	
		    if (dado1 == dado2 && dado2 == dado3) {
				System.out.println("Voc� ganhou 6 pontos de b�nus!");
			    System.out.println("Sua pontua��o �: " + (somaDados = somaDados + 6));
			    System.out.println("VOC� � MUITO SORTUDO!!!");
		    }else {
		    	System.out.println("Voc� ganhou 2 pontos de b�nus! ");
				System.out.println("Sua pontua��o �: " + (somaDados = somaDados + 2));
		    
		    }
		}
		if (somaDados < 15) {
	    	System.out.println("Lamento, mas voc� PERDEU!");
	    }
	    else {
	    	System.out.println("PARAB�NS, VOC� GANHOU!");
	    }
	}
}
