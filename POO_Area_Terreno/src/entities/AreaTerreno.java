package entities;

public class AreaTerreno {

	//Faça um programa com a clarre AreaTerreno que tem o atributo area e o método retorna area com os atributos
	//largura e comprimento. Na classe principal peça para o usuário entrar com os dados de largura
	// e comprimento e retorne o valor do calculo feito no método da classe AreaTerreno.
	
	/*aqui o atributo é  : area */
	
	public double area;
	

	public void retornaArea(double largura, double comprimento) {
		area = (largura * comprimento);
	}
}
