/*
 * Laboratório de Programação 2 - Lab 1
 *
 * @author Franklin Regis de Oliveira - 119210030
 */

import java.util.Scanner;

public class posicaoPalavra {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int pos = -1;
		String entryChar = sc.nextLine();
		char letterChosen = entryChar.charAt(0);
		String word = sc.nextLine();
		char letter = ' ';
		for(int i=0;i<word.length();i++){
			letter = word.charAt(i);
			if(letter == letterChosen){pos = i;}
		}
		System.out.println(pos);
	}
}
