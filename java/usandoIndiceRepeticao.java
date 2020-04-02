/*
 * * Laboratório de Programação 2 - Lab 1
 * *
 * * @author Franklin Regis de Oliveira - 119210030
 * */

import java.util.Scanner;

public class usandoIndiceRepeticao{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int numbers = sc.nextInt(), value = 0;
		for(int i=0;i<numbers;i++){
			value = sc.nextInt();
			System.out.println(i + " " + value);
		}
	}
}
