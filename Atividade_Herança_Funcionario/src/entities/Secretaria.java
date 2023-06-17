package entities;

public class Secretaria extends Funcionario {

	public Secretaria(String nome, String departamento, char sexo, double salario) {
		super(nome, departamento, sexo, salario);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void bonificacao() {
		// TODO Auto-generated method stub
		this.salario += 150;
	}
}
