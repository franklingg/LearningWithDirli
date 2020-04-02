/*
 * * Laboratório de Programação 2 - Lab 1
 * *
 * * @author Franklin Regis de Oliveira - 119210030
 * */

import java.util.Scanner;

public class somaDuasListas{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] array1 = new int[4];
		int[] array2 = new int[4];
		for(int i=0;i<4;i++){array1[i]=sc.nextInt();}
		for(int i=0;i<4;i++){array2[i]=sc.nextInt();}
		int toRead = sc.nextInt();
		System.out.println(array1[toRead] + array2[toRead]);
	}
}
