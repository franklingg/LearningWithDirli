/*
 * * Laboratório de Programação 2 - Lab 1
 * *
 * * @author Franklin Regis de Oliveira - 119210030
 * */

import java.util.Scanner;

public class repetindoComandos{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int numbers = sc.nextInt();
		int[] nums = new int[numbers];
		for(int i=0; i<numbers;i++){nums[i] = sc.nextInt();}
		int toRead = sc.nextInt();
		System.out.println(nums[toRead]);
	}
}
