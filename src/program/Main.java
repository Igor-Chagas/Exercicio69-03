package program;

import java.util.Scanner;

import entites.Aluno;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		Aluno aluno = new Aluno ();
		
		System.out.println("Por favor, insira o nome do aluno:");
		aluno.name = sc.nextLine();
		System.out.println("Por favor, insira as notas:");
		aluno.p1 = sc.nextDouble();
		aluno.p2 = sc.nextDouble();
		aluno.p3 = sc.nextDouble();
		
		System.out.printf("FINAL GRADE = %.2f\n", aluno.media());
		
		aluno.resultado();
		
		sc.close();
	}

}
