/*
 * Laboratório de Programação 2 - Lab 1
 *
 * @author Franklin Regis de Oliveira - 119210030
 */

import java.util.Scanner;

public class somaMultiplicacao{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		double n2 = sc.nextDouble();
		double sum = n1 + n2;
		double mtpy = n1 * n2;
		System.out.println(sum);
		System.out.println(mtpy);
	}
}
