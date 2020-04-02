/*
 * * Laboratório de Programação 2 - Lab 1
 * *
 * * @author Franklin Regis de Oliveira - 119210030
 * */

import java.util.Scanner;

public class listas2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] values = new int[3];
		for(int i=0;i<3;i++){values[i]=sc.nextInt();}
		int changeId = sc.nextInt();
		int changeValue = sc.nextInt();
		values[changeId] += changeValue;
		for(int i=0;i<3;i++){System.out.println(values[i]);}
	}
}
