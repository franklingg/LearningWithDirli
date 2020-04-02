/*
 * * Laboratório de Programação 2 - Lab 1
 * *
 * * @author Franklin Regis de Oliveira - 119210030
 * */

import java.util.Scanner;

public class imprimindoOrdemLetras{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		char letter = ' ';
		for(int i=1; i<word.length()+1;i++){
			letter = word.charAt(i-1);
			System.out.println(i + ": " + letter);
		}
	}
}
