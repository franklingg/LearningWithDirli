/*
 * Laboratório de Programação 2 - Lab 1
 *
 * @author Franklin Regis de Oliveira - 119210030
 */

import java.util.Scanner;

public class blitz{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int licenca = sc.nextInt(), carteira = sc.nextInt();
		double alcool = sc.nextDouble();
		if(licenca >= 30 || carteira >= 30 || alcool > 0.05){System.out.println("True");}
		else{System.out.println("False");}
	}
}
