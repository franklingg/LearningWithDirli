/*
 * Laboratório de Programação 2 - Lab 1
 *
 * @author Franklin Regis de Oliveira - 119210030
 */

import java.util.Scanner;

public class maioresQueValor{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		if(n1 > n3 && n2 > n3){System.out.println('S');}
		else{System.out.println('N');}	
	}
}

