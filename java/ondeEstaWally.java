/**
 * * Laboratório de Programação 2 - Lab 1
 * *
 * * @author Franklin Regis de Oliveira - 119210030
 * */

import java.util.Scanner;

public class ondeEstaWally {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	while (true) {
	String lista = sc.nextLine();
	if (lista.equals("wally")) {break;}
	String[] nomes = lista.split(" ");
	String nome_final = new String("?");
	for (String nome: nomes) {
		if (nome.length() == 5) {
			nome_final = nome;
		}
	}
	System.out.println(nome_final);	
	}
	}
}
