package entities;

public class Gerente extends Funcionario {

	public Gerente(String nome, String departamento, char sexo, double salario) {
		super(nome, departamento, sexo, salario);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void bonificacao() {
		this.salario += 500;
	}

}
