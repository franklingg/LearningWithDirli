/*
 * Laboratório de Programação 2 - Lab 1
 *
 * @author Franklin Regis de Oliveira - 119210030
 */

import java.util.Scanner;

public class mensagemAmigoSecreto{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String input1 = sc.nextLine();
		char opcao1 = input1.charAt(0);
		String nome = "pessoa", objeto = "presente";
		if(opcao1 == 's'){nome = sc.nextLine();}
		String input2 = sc.nextLine();
		char opcao2 = input2.charAt(0);
		if(opcao2 == 's'){objeto = sc.nextLine();}	
		System.out.println("Oi " + nome + ", espero que goste de receber " + objeto + "!");
		System.out.println("E Boas Festas!");
	}
}
