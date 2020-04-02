/*
 * Laboratório de Programação 2 - Lab 1
 *
 * @author Franklin Regis de Oliveira - 119210030
 */

import java.util.Scanner;

public class comandoRepeticoesCondicao{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int sum = 0, entrada = sc.nextInt();		
		while(entrada != -1) {
			if(entrada % 2 == 0){sum += entrada;}
			entrada = sc.nextInt();
		}
		System.out.println(sum);
	}
}
