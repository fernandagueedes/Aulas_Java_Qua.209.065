package entities;

public class AreaTerreno {

	//Fa�a um programa com a clarre AreaTerreno que tem o atributo area e o m�todo retorna area com os atributos
	//largura e comprimento. Na classe principal pe�a para o usu�rio entrar com os dados de largura
	// e comprimento e retorne o valor do calculo feito no m�todo da classe AreaTerreno.
	
	/*aqui o atributo �  : area */
	
	public double area;
	

	public void retornaArea(double largura, double comprimento) {
		area = (largura * comprimento);
	}
}
