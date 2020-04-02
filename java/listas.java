/*
 * * Laboratório de Programação 2 - Lab 1
 * *
 * * @author Franklin Regis de Oliveira - 119210030
 * */

import java.util.Scanner;

public class listas{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] values = new int[5];
		for(int i=0;i<5;i++){values[i]=sc.nextInt();}
		int toRead = sc.nextInt();
		System.out.println(values[toRead]);
	}
}
