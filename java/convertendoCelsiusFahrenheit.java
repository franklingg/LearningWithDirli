/*
 * Laboratório de Programação 2 - Lab 1
 *
 * @author Franklin Regis de Oliveira - 119210030
 */

import java.util.Scanner;

public class convertendoCelsiusFahrenheit{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int celsius = sc.nextInt();
		int fahr = (int) (1.8 * celsius + 32);
		System.out.println(fahr);
	}
}
