/*
 * * Laboratório de Programação 2 - Lab 1
 * *
 * * @author Franklin Regis de Oliveira - 119210030
 * */

import java.util.Scanner;

public class linguaPe{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		char letter = word.charAt(0);
		if(letter == 'p'){
			letter = word.charAt(1);
			if(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u'){
				System.out.println('s');
			} else {System.out.println('n');};
		}
		else{System.out.println('n');}
	}
}
