/*
 * Laboratório de Programação 2 - Lab 1
 *
 * @author Franklin Regis de Oliveira - 119210030
 */

import java.util.Scanner;

public class comandoCondicional{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		if(word.length() >= 5){System.out.println("PALAVRA GRANDE!");}
		else{System.out.println("palavrinha");}
	}
}
