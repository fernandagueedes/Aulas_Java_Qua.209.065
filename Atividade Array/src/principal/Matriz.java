package principal;

public class Matriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		/*para formar matriz:
		 * primeiro ele forma as linhas e depois as colunas
     	 * abre um for pra linha (i), e um for pra coluna (j)
		 */
		
		int[][] numeros = new int[3][3];
		
		int contador = 1;
		
		for(int i = 0; i < numeros.length; i++) {
			for(int j = 0; j < numeros.length; j++) {
				numeros[i][j] = contador;
				System.out.print(numeros[i][j] + "\t");
				contador++;

			}
	
			System.out.println();
		
					
		}
		System.out.println("Desjafio: ");
		
		for(int i = 0; i < numeros.length; i++) {
			
			for(int j = 0; j < numeros[i].length; j++) {
				
				if(numeros[i].equals(numeros[j])) {
					System.out.print(numeros[i][j] + "\t");
				} else {
					System.out.print("\t");
					
				}
			}	
				
				
			}
	
			System.out.println();
		
					
		
		}
	}


