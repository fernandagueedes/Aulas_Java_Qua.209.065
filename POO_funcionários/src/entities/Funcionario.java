package entities;

public class Funcionario {

	/*Fa�a um programa que tenha uma classe funcion�rio com os atributos nome, 
	 * cargo, salario. Verifique o salario e o cargo, se for gerente e ganhar menos que 5 mil, 
	 * recebe um b�nus no salario de 1.5 % no valor do salario base, 
	 * se for vendedor e ganhar menos que 1500 ganha 2% sobre o salario base. 
	 * Mostre o valor do salario bruto atualizado e os dados do funcion�rio;
	 */
	
	
	public String nome;
	public String cargo;
	public Double salario;
	
	public void verificaComissao() {
		if (cargo.equals ("gerente") && salario < 5000 ) {
			salario = salario + (salario * 0.015);	
		}
		if(cargo.equals("vendedor") && salario < 1500) {
			salario = salario + (salario * 0.02);
			}
		System.out.println();
	}
	


	
	
}
	
