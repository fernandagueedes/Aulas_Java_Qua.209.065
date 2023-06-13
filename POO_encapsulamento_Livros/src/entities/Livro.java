package entities;

public class Livro {
	//Ordem sugerida a seguir na classe:
	//1� atributos da classe
	// 2� construtores
	// 3� metodo get e set
	// 4� demais m�todos
	//get � pra obter e set � pra atribuir
	//quando precisa de dados obrigat�rios faz o construtor (Alt + Shift + S Constructor superClass) 
	// o this � uma palavra para distinguir o que � atributo da classe para o parametro recebido
	
	private String nomeLivro;
	private int edicao;
	private double valor;
	
	public Livro(String nomeLivro, int edicao, double valor) {
		super();
		this.nomeLivro = nomeLivro;
		this.edicao = edicao;
		this.valor = valor;
	}

	public String getNomeLivro() {
		return nomeLivro;
	}

	public void setNomeLivro(String nomeLivro) {
		this.nomeLivro = nomeLivro;
	}

	public int getEdicao() {
		return edicao;
	}

	public void setEdicao(int edicao) {
		this.edicao = edicao;
	}

	public double getValor() {
		return valor;
	}
 
	public void setValor(double valor) {
		if (valor > 100) {
			this.valor+= (valor * 0.30);
		}
		else {
			this.valor = valor;
		}
		
			
		
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Livro: " + nomeLivro + "\nEdi��o: " + edicao + "\nValor: R$ " + valor;
		
	}
	
	
}
