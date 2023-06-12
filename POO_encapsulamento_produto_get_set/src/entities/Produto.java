package entities;

public class Produto {
	//this.quantidade usa o this. no atributo
	

	private String descricao;
	private int quantidade;
	private double preco;
	
	
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

	public void adicionaProduto (int quantidade) {
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
		return "Produto : " + descricao + "\nQuantidade: " + quantidade + "\nTotal em estoque: R$ " + String.format("%.2f", retornaTotalEmEstoque());
		
	}
}
