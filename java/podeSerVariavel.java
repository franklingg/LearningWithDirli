/*
 * * Laboratório de Programação 2 - Lab 1
 * *
 * * @author Franklin Regis de Oliveira - 119210030
 * */

import java.util.Scanner;

public class podeSerVariavel{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		char first = word.charAt(0);
		if(Character.isDigit(first)){System.out.println('N');}
		else{System.out.println('S');}
	}
}
