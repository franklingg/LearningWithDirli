/*
 * * Laboratório de Programação 2 - Lab 1
 * *
 * * @author Franklin Regis de Oliveira - 119210030
 * */

import java.util.Scanner;

public class dividindoStrings{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String[] array1 = sc.nextLine().split(" ");
		String[] array2 = sc.nextLine().split(" ");
		for(int i=0;i<array1.length;i++){System.out.println(array1[i] + " " + array2[i]);}
	}
}
