/*
 * Laboratório de Programação 2 - Lab 1
 *
 * @author Franklin Regis de Oliveira - 119210030
 */

import java.util.Scanner;

public class almocoBiloca{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double money = sc.nextDouble();
		int cafes = sc.nextInt();
		double saldo = money - cafes*0.5;
		if(saldo >= 10){System.out.println("PODE COMER!");}
		else{System.out.println("SEM COMIDA HOJE!");}
	}
}
