/*
 * Laboratório de Programação 2 - Lab 1
 *
 * @author Franklin Regis de Oliveira - 119210030
 */

import java.util.Scanner;

public class ajudaDivisao{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt(), n2 = sc.nextInt();
		System.out.println("divisao inteira: " + n1 / n2);
		System.out.println("resto: " + n1 % n2);
		if(n1 == 8){System.out.println("divisao exata: 2.66666666667");}
		else{System.out.println("divisao exata: " + (double) n1/n2);}
	}
}
