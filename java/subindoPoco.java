/*
 * Laboratório de Programação 2 - Lab 1
 *
 * @author Franklin Regis de Oliveira - 119210030
 */

import java.util.Scanner;

public class subindoPoco{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int profu = sc.nextInt();
		System.out.println((int)Math.ceil(profu/3.0));
	}
}
