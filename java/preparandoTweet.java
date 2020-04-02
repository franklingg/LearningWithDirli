/*
 * Laboratório de Programação 2 - Lab 1
 *
 * @author Franklin Regis de Oliveira - 119210030
 */

import java.util.Scanner;

public class preparandoTweet{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		System.out.println(140-word.length());
	}
}
