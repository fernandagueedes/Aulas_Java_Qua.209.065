package principal;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Quando precisarmos repetir certa estrutura de c�digos utilizamos as chamadas "ESTRUTURAS DE REPETI��O"
		 * FOR � mais utilizada quando j� sabemos a quantidade de vezes que precisamos repetir os comandos.
		 * a sintaxe � escrita da seguinte forma:
		 *  (/t) da uma tabula��o entre as informa��es
		 *  (/n) quebra uma linha
		 * 
		 * contador ++ significa o mesmo que escrever: (contador + 1)
		 * for    1� variavel que inicia o contador;
		 *        2� condi��o que deve ser aceita;
		 *        3� incremento;
		 */
		
	/*	for (int contador = 0; contador <10; contador++)
		     System.out.println("valor de contador: " + contador);
		
		EXERC�CIO:
		 Programa em Java que mostra os n�meros �mpares ate 25
         2 Altere o primeiro programa para mostrar a soma dos n�meros impares
         3 altere novamente o programa para mostrar os n�meros impares um abaixo do outro e depois um ao lado do outro
		*/
		
		
	/*	for (int impar = 0; impar <= 25; impar++ ) {
			if ( impar % 2 == 1) {
			System.out.println(impar);
			}
	} */
		
		/* numeros impares um ao lado do outro)
		
       
		for (int impar = 0; impar <= 25; impar++ ) {
			if ( impar % 2 == 1) {
			System.out.print(impar + " ");
			}
		}
	*/
		int soma = 0;
		for (int impar = 0; impar <= 25; impar++ ) {
			if ( impar % 2 == 1) {
			System.out.println(impar);
			soma = soma + impar;
			}
	}
		
		System.out.println("A soma dos n�meros impares �: " + soma );
	}
}
