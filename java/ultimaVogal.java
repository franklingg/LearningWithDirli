/*
 * Laboratório de Programação 2 - Lab 1
 *
 * @author Franklin Regis de Oliveira - 119210030
 */

import java.util.Scanner;

public class ultimaVogal{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<5; i++){
			String palavra = sc.nextLine();
			char last = palavra.charAt(palavra.length()-1);
			if(last=='a' || last=='e' || last=='i' || last=='o' || last=='u'){
				System.out.print(last);
			}
		}
	}
}
