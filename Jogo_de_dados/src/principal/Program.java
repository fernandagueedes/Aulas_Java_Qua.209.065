package principal;

import java.util.Random;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Faça um programa para gerar 3 números aleatórios para 3 dados, 
		 * mostre a soma dos números que saíram. Se 2 dados saírem com a mesma numeração o jogador ganha 2 pontos de bônus,
		 *  se os 3 dados saírem com a mesma numeração ele ganha 6 pontos de bônus 
		 *  e deve aparecer a mensagem "você é muito sortudo". 
		 *  Se o total da soma dos dados mais o bônus for menor que 15 o jogador perde 
		 *  e apresenta a mensagem "Lamento, mas você perdeu", 
		 *  se for maior ou igual a 15 ele ganha e apresenta a mensagem "parabéns, você ganhou!"
		 */
		
		
		Random randon = new Random();
		
		int dado1 = randon.nextInt(6) + 1;
		System.out.println("Dado 1: " + dado1);
		
		int dado2 = randon.nextInt(6) + 1;
		System.out.println("Dado 2: " + dado2);
		
		int dado3 = randon.nextInt(6) + 1;
		System.out.println("Dado 3: " + dado3);
        
		int somaDados = (dado1 + dado2 + dado3);
		
		System.out.println("A soma dos dados é: " + somaDados);		
		
		if (dado1 == dado2 || dado2 == dado3 || dado1 == dado3) {
		
	
		    if (dado1 == dado2 && dado2 == dado3) {
				System.out.println("Você ganhou 6 pontos de bônus!");
			    System.out.println("Sua pontuação é: " + (somaDados = somaDados + 6));
			    System.out.println("VOCÊ É MUITO SORTUDO!!!");
		    }else {
		    	System.out.println("Você ganhou 2 pontos de bônus! ");
				System.out.println("Sua pontuação é: " + (somaDados = somaDados + 2));
		    
		    }
		}
		if (somaDados < 15) {
	    	System.out.println("Lamento, mas você PERDEU!");
	    }
	    else {
	    	System.out.println("PARABÉNS, VOCÊ GANHOU!");
	    }
	}
}
