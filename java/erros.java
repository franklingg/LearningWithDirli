/*
 * Laboratório de Programação 2 - Lab 1
 *
 * @author Franklin Regis de Oliveira - 119210030
 */

import java.util.Scanner;

public class erros{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int a = 1 + (3*input);
		int b = 2 * a;
		System.out.println(b);
	}
}
