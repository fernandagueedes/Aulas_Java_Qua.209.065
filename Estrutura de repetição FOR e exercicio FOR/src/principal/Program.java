package principal;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Quando precisarmos repetir certa estrutura de códigos utilizamos as chamadas "ESTRUTURAS DE REPETIÇÃO"
		 * FOR é mais utilizada quando já sabemos a quantidade de vezes que precisamos repetir os comandos.
		 * a sintaxe é escrita da seguinte forma:
		 *  (/t) da uma tabulação entre as informações
		 *  (/n) quebra uma linha
		 * 
		 * contador ++ significa o mesmo que escrever: (contador + 1)
		 * for    1º variavel que inicia o contador;
		 *        2º condição que deve ser aceita;
		 *        3º incremento;
		 */
		
	/*	for (int contador = 0; contador <10; contador++)
		     System.out.println("valor de contador: " + contador);
		
		EXERCÍCIO:
		 Programa em Java que mostra os números ímpares ate 25
         2 Altere o primeiro programa para mostrar a soma dos números impares
         3 altere novamente o programa para mostrar os números impares um abaixo do outro e depois um ao lado do outro
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
		
		System.out.println("A soma dos números impares é: " + soma );
	}
}
