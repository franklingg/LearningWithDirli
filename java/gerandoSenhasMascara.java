/*
    * Laboratório de Programação 2 - Lab 1
    * *
    * * @author Franklin Regis de Oliveira - 119210030
    * */

import java.util.Scanner;

public class gerandoSenhasMascara{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] indices = new int[4];
		String[] words = new String[4];
		for(int i=0;i<4;i++){indices[i] = sc.nextInt();}
		sc.nextLine();
		for(int i=0;i<4;i++){words[i] = sc.nextLine();}
		for(int i=0;i<4;i++){
			char key = words[i].charAt(indices[i]);
			System.out.print(key);
		}
	}
}
