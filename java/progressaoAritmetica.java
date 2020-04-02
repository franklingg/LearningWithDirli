/*
 * Laboratório de Programação 2 - Lab 1
 *
 * @author Franklin Regis de Oliveira - 119210030
 */

import java.util.Scanner;

public class progressaoAritmetica{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int inicial = sc.nextInt();
		int razao = sc.nextInt();
		int sum = 0, termo = 0;
		for(int i=0;i<3;i++){
			termo = inicial + razao * i;
			System.out.println(termo);
			sum += termo;
		}
		System.out.println(sum);
	}
}
