/*
 * Laboratório de Programação 2 - Lab 1
 *
 * @author Franklin Regis de Oliveira - 119210030
 */

import java.util.Scanner;

public class imprimindoTabuada{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt(), calculated = 0;
		for(int i=1; i<10;i++){
			calculated = i * number;
			System.out.println(i + "x" + number + " = " + calculated);
		}
	}
}
