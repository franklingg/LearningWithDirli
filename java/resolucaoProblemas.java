/*
 * Laboratório de Programação 2 - Lab 1
 *
 * @author Franklin Regis de Oliveira - 119210030
 */

import java.util.Scanner;

public class resolucaoProblemas{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int caixa = sc.nextInt();
		int sanduiches = sc.nextInt();
		int sucos = caixa - sanduiches * 4;
		System.out.println(sucos);
	}
}
