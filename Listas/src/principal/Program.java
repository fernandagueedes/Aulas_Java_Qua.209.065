package principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		
		//Listas em java come�a declarando com List<>
		//a lista n�o tem um tamanho fixo, a lista cont�m a posi��o igual ao array, mas n�o tem a quantidade de posi��es
		//definidas, vai depender da quantidade de dados que vai adicionando;
		//Lista em JAva � uma cole��o de dados, � um dos c�digos mais utilizados no dia a dia
		//o indice inicia a contagem em 0, ou seja, na lista abaixo o luna � a posi��o 0;
		//S�o uma estrutura de dados homog�neos, ou seja, todos os dados contidos nesta lista ser�o do mesmo tipo
		//para percorrer os nomes da lista da o for no caso abaixo:
		//for (String nome : nome) {System.out.println("Nome : "+nome); o ":" significa que para cada nome contido em nomes
		
		
		List<String> nomes = new ArrayList<>();
		/*adiciona dados na lista */
		nomes.add("Luan");
		nomes.add("Maria");
		nomes.add("Fernanda");
		nomes.add("Amanda");
		nomes.add("Bruno");
		nomes.add("Carlos");
		
		/* mostra os dados da lista
		 */
		for(String nome: nomes) {
			System.out.println("Nome: " + nome);
			
			
			
	
		}
		//obtem o dado da lista por indice (posi��o na mem�ria)
		System.out.println("o 4� nome da lista � (posi��o indice 3) : " + nomes.get(3));
		
		/*remove dados da lista o que esta dentro() � a posi��o do dado a ser removido 
		 * nomes.remove(2);
		for (String nome: nomes) {
			System.out.println("nome: " + nome);
		*/
		String dado = nomes.stream().filter(x-> x == "Luan").findFirst().orElse(null);
		
		Collections.sort(nomes);
		System.out.println("Imprimindo em ordem alfab�tica");
		for (String nome : nomes) {
			System.out.println("Nome: " + nome);
		}
		
		System.out.println(dado);
	
		}

}

