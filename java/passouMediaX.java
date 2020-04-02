/*
 * Laboratório de Programação 2 - Lab 1
 *
 * @author Franklin Regis de Oliveira - 119210030
 */

import java.util.Scanner;

public class passouMediaX{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		double n1 = sc.nextDouble(), n2 = sc.nextDouble(), mediaX = sc.nextDouble();
		double media = (n1 + n2)/2;
		if(media >= mediaX){System.out.println("pass: True!");}
		else{System.out.println("pass: False!");}
	}
}
