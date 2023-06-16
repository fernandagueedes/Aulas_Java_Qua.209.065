package entities;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {

	private String nome;
	private int idade;
	private String telefone;

	public Pessoa() {
		super();

	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public String getTelefone() {
		return telefone;
	}

	@Override
	public String toString() {

		return "Nome: " + nome + "\nIdade: " + idade + "\nTelefone: " + telefone;
	}

}
