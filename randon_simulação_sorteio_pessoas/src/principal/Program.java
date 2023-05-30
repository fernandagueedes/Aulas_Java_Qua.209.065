package principal;

import java.util.Random;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		Random random = new Random();

		String[] nome = new String[10];
		int numeroSorteado = random.nextInt(11);
		for (int i = 0; i < 10; i++) {
			System.out.print("Entre com o nome da pessoa" + (i + 1) + " : ");
			nome[i] = sc.nextLine();

		}
		System.out.println("O ganhador do curso java foi: " + nome[numeroSorteado]);

		sc.close();

	}

}
