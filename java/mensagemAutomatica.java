/*
 * Laboratório de Programação 2 - Lab 1
 *
 * @author Franklin Regis de Oliveira - 119210030
 */

import java.util.Scanner;

public class mensagemAutomatica{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		System.out.println("Exuberante estudante " + name + ", lhe tenho na mais alta estima ao ler a sua mensagem e responder que a resposta da sua pergunta encontra-se no site da disciplina.");
		System.out.println("Cordialmente,");
		System.out.println("Matheus G.");
	}
}
