/*
 * Laboratório de Programação 2 - Lab 1
 *
 * @author Franklin Regis de Oliveira - 119210030
 */

import java.util.Scanner;

public class calculadora3Valores{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		double n1 = sc.nextDouble(), n2 = sc.nextDouble(), n3 = sc.nextDouble();
		double sum = n1 + n2 + n3;
		double mtpy = n1 * n2 * n3;
		
		System.out.println("Oi " + name + "!");
		System.out.format("%.1f", sum);
		System.out.println();
		System.out.format("%.1f", mtpy);
	}
}
