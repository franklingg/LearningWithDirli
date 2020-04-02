/*
 * Laboratório de Programação 2 - Lab 1
 *
 * @author Franklin Regis de Oliveira - 119210030
 */

import java.util.Scanner;

public class maiorDoisValores{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		if (n1 >= n2){System.out.println(n1);}
		else{System.out.println(n2);}
	}
}
