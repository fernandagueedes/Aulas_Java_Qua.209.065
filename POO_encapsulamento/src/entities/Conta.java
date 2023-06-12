package entities;

public class Conta {
	
	/*metodos acessores: set para atribuir o valor, get para pegar o valor atribuido
	 * alt + shift + S
	*/
	
	private int numeroConta;
	private int agencia;
	private double saldo;
	private String titular;
	
	public void depositar(double valorDepositado) {
		saldo += valorDepositado;
	}
	public int getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public double getSaldo() {
		return saldo;
	}
	public void sacar(double valorSacado) {
		saldo -= valorSacado;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Titular: " + titular + "\nAgencia: " + agencia + " \nConta: " + numeroConta + "\nSaldo: " + saldo;
	}
}

