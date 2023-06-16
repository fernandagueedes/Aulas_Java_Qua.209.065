package entities;

public class Aluno {

	private String nomeAluno;
	private int serie;
	private double media;

	

	public String getNomeAluno() {
		return nomeAluno;
	}

	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}

	public int getSerie() {
		return serie;
	}

	public void setSerie(int serie) {
		this.serie = serie;
	}

	public double getMedia() {
		return media;
	}
	public void notas(double nota1, double nota2, double nota3, double nota4) {
		this.media = (nota1 + nota2 + nota3 + nota4)/4;

	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Aluno: " + nomeAluno + "\nSérie: " + serie + "\nMédia: " + media;
	}

}
