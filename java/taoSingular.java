/*
 * * Laboratório de Programação 2 - Lab 1
 * *
 * * @author Franklin Regis de Oliveira - 119210030
 * */

import java.util.Scanner;

public class taoSingular{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		char last = word.charAt(word.length()-1);
		if(last == 's' || last == 'S'){System.out.println("TALVEZ PLURAL");}
		else{System.out.println("TALVEZ SINGULAR");}
	}
}
