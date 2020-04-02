/*
 * Laboratório de Programação 2 - Lab 1
 *
 * @author Franklin Regis de Oliveira - 119210030
 */

import java.util.Scanner;

public class resultadosProva {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int maior = 0, menor = 1000, sum = 0, media = 0, acima = 0, abaixo = 0, n=0;	//n: number of students
	int[] notas = new int[n];
	while (true) {	
		String aluno = sc.nextLine();
		String[] dados = aluno.split(" ");
		if (aluno.equals("-")) { break; }
		n++;
		Integer nota = Integer.parseInt(dados[1]);

		if (nota > maior) {maior = nota;}
		if (nota < menor) {menor = nota;}
		sum += nota;
		if (nota >= 700) {acima++;}
	}
	media = sum / n;
	abaixo = n - acima;

	System.out.println("maior: " + maior);
	System.out.println("menor: " + menor);
	System.out.println("media: " + media);
	System.out.println("acima: " + acima);
	System.out.println("abaixo: " + abaixo);
	}
}
