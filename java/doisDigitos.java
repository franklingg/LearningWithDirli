/*
 * * Laboratório de Programação 2 - Lab 1
 * *
 * * @author Franklin Regis de Oliveira - 119210030
 * */

import java.util.Scanner;

public class doisDigitos{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		if(word.length()==0 || word.length()==1){System.out.println('N');}
		else{
			char letter = word.charAt(0);
			if(Character.isDigit(letter)){
				letter = word.charAt(1);
				if(Character.isDigit(letter)){System.out.println('S');}
				else{System.out.println('N');}
			} else {System.out.println('N');}
		}
	}
}
