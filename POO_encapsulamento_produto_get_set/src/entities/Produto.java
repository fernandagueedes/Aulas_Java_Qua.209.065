package entities;

public class Produto {
	// this.quantidade usa o this. no atributo
	// Alt Shift S Generate constructor from
	//get uso para atribuir ou seja, consigo alterar.
	//set eu s� consigo visualizar, n�o altero. exemplo saldo conta bancaria, preciso de um m�todo para alterar, 
	// n�o consigo alter�-lo diretamente.

	private String descricao;
	private int quantidade;
	private double preco;

	public Produto() {
		super();
		
	}

	public Produto(String descricao, int quantidade, double preco) {
		super();
		this.descricao = descricao;
		this.quantidade = quantidade;
		this.preco = preco;
	}
	public Produto( int quantidade, double preco) {
		super();
		this.quantidade = quantidade;
		this.preco = preco;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void adicionaProduto(int quantidade) {
		this.quantidade += quantidade;
	}

	public void removeProduto(int quantidade) {
		this.quantidade -= quantidade;
	}

	public double retornaTotalEmEstoque() {
		return quantidade * preco;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Produto : " + descricao + "\nQuantidade: " + quantidade + "\nTotal em estoque: R$ "
				+ String.format("%.2f", retornaTotalEmEstoque());

	}
}
