/**
* Laboratório de Programação 2 - Lab 1
*
* @author Franklin Regis de Oliveira - 119210030
*/

import java.util.Scanner;

public class palavrasPoeticas{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String palavra1 = sc.nextLine();
		String palavra2 = sc.nextLine();
		char primeira1 = palavra1.charAt(0), primeira2 = palavra2.charAt(0);
		char ultima1 = palavra1.charAt(palavra1.length()-1), ultima2 = palavra2.charAt(palavra2.length()-1);
		if(primeira1 == primeira2 && ultima1 == ultima2) {
			System.out.println("S");
		} else {
		System.out.println("N");
		}
	}
}
