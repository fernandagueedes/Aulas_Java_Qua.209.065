package entities;

public class Funcionario {
	
	private String nome;
	private String departamento;
	private char sexo;
	protected double salario;
	
	public Funcionario(String nome, String departamento, char sexo, double salario) {
		super();
		this.nome = nome;
		this.departamento = departamento;
		this.sexo = sexo;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public void bonificacao () {
		this.salario+=0;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Nome: " + nome + "\nDepartamento: "+ departamento +
				"\nSexo: " + sexo + "\nSalario: " + salario + "\nBonificação: ";
	}
	
	
	
	
	
}
