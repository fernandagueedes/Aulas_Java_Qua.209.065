package principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Aluno;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Aluno aluno;
		List<Aluno> alunos = new ArrayList<>();
		
		for (int i = 0; i < 4; i++) {
			aluno = new Aluno();
			System.out.println("Entre com o nome do aluno: ");
			aluno.setNomeAluno(sc.nextLine());
			
			System.out.println("Entre com a série do aluno: ");
			aluno.setSerie(sc.nextInt());
			System.out.println("Entre com as 4 notas do aluno: ");
			aluno.notas(sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
			alunos.add(aluno);
			sc.nextLine();
			
		}
		
		System.out.println("Alunos e suas médias: ");
		
		for(Aluno a : alunos) {
			System.out.println(a);
			System.out.println();
			
		}
		sc.close();
		
	}
	

}
