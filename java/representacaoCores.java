/**
* Laboratório de Programação 2 - Lab 1
*
* @author Franklin Regis de Oliveira - 119210030
*/

import java.util.Scanner;


public class representacaoCores{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int red = sc.nextInt();
		int green = sc.nextInt();
		int blue = sc.nextInt();

		if(red < 128 || green < 128 || blue < 128) {
			System.out.println("PRETO");
		} else {
			System.out.println("BRANCO");
		}
	}
}
