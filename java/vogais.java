/*
 * * Laboratório de Programação 2 - Lab 1
 * *
 * * @author Franklin Regis de Oliveira - 119210030
 * */

import java.util.Scanner;

public class vogais{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String word = " ";
		char first = ' ';
		int count = 0;
		for(int i=0;i<5;i++){
			word = sc.nextLine();
			first = word.charAt(0);
			if(first=='a' || first=='e' || first=='i' || first=='o' || first=='u'){count++;}
		}
		System.out.println(count);
	}
}
