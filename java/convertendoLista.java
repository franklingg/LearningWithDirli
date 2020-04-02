/*
 * * Laboratório de Programação 2 - Lab 1
 * *
 * * @author Franklin Regis de Oliveira - 119210030
 * */

import java.util.Scanner;

public class convertendoLista{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String[] input1 = sc.nextLine().split(" ");
		String[] input2 = sc.nextLine().split(" ");
		Integer number1 = 0, number2 = 0;
		for(int i=0;i<input1.length;i++){
			number1 = Integer.parseInt(input1[i]);
			number2 = Integer.parseInt(input2[i]);
			System.out.println(number1-number2);
		}
	}
}
