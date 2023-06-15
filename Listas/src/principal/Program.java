package principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		
		//Listas em java começa declarando com List<>
		//a lista não tem um tamanho fixo, a lista contém a posição igual ao array, mas não tem a quantidade de posições
		//definidas, vai depender da quantidade de dados que vai adicionando;
		//Lista em JAva é uma coleção de dados, é um dos códigos mais utilizados no dia a dia
		//o indice inicia a contagem em 0, ou seja, na lista abaixo o luna é a posição 0;
		//São uma estrutura de dados homogêneos, ou seja, todos os dados contidos nesta lista serão do mesmo tipo
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
		//obtem o dado da lista por indice (posição na memória)
		System.out.println("o 4º nome da lista é (posição indice 3) : " + nomes.get(3));
		
		/*remove dados da lista o que esta dentro() é a posição do dado a ser removido 
		 * nomes.remove(2);
		for (String nome: nomes) {
			System.out.println("nome: " + nome);
		*/
		String dado = nomes.stream().filter(x-> x == "Luan").findFirst().orElse(null);
		
		Collections.sort(nomes);
		System.out.println("Imprimindo em ordem alfabética");
		for (String nome : nomes) {
			System.out.println("Nome: " + nome);
		}
		
		System.out.println(dado);
	
		}

}

