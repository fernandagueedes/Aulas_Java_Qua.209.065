package principal;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 variaveis s�o espa�o alocados na memoria que
		 salvam uma informa��o (um dado)
		 
		 o tipo int armazena n�meros inteiros
		 int s�o numeros: 1 , 2 , 3 , 10, 150...
		 double que s�o n�meros com casas decimais exemplos: 10.50, 25.99...
		 char � o tipo que armazena um caractere � um tipo "literal" e a sua inicializa��o � feita com aspas simples exemplos: c, d, a, 1, 2...
		 String � uma classe do java utilizada para armazenar cadeias de caracteres (frases por exemplo)
		 sua inicializa��o � feita com aspas duplas exemplos de String: nomes, locais... 
		 */
		
		int numero = 10;
		double precoDaCamisa = 20.52;
		String nome = "Fernanda Guedes";
		char sexo = 'F';
		
		int num1 = 5;
		int num2 = 10;
		int resultado = num1 + num2;
		
		String sobrenome = "Guedes";
		int idade = 32;
		double saldoBancario = 99.99;
	
	
		
		System.out.println(numero);
		System.out.println(precoDaCamisa);
		System.out.println(nome);
		System.out.println(sexo);
		
		precoDaCamisa = 50.65;
		System.out.println(precoDaCamisa);
		System.out.println();
		System.out.println();
		
		System.out.print(nome);
		System.out.print(sexo);
		System.out.print(precoDaCamisa);
		System.out.println();
		System.out.println();
		
		System.out.print(nome + " " + sexo + " " + " " + precoDaCamisa);
		System.out.println();
		
		System.out.println(nome + " comprou uma camisa com o valor de: R$ " + precoDaCamisa);
		
		
		nome = "Fernanda Souza";
		precoDaCamisa = 60.50;
		System.out.println(nome + " comprou uma camisa com o valor de: R$ " + precoDaCamisa);
		System.out.println();
		System.out.println(2+ 2); 
		
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num1 + num2);
		System.out.println("O resultado �: " + resultado);
		System.out.println("O resultado �: " + (num1 + num2));
		System.out.println();
		
		System.out.println(sobrenome + " tem " + idade + " anos e possui " + saldoBancario + " na conta ");
		
	
		/*
		  crie uma vari�vel com seu nome 
		  crie uma variavel com sua idade
		  crie uma variavel com um saldo de conta
		  mostre na tela a frase
		  
		  Guedes tem 32 anos e possui 5 reais na conta
		 */
		
		
	}
	

}
