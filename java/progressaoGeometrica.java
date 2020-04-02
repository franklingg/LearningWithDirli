/*
 * Laboratório de Programação 2 - Lab 1
 *
 * @author Franklin Regis de Oliveira - 119210030
 */

import java.util.Scanner;

public class progressaoGeometrica{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int inicial = sc.nextInt();
		int razao = sc.nextInt();
		int mtpy = 1, termo = 0;
		for(int i=0; i<3;i++){
			termo = inicial * (int) Math.pow(razao,i);
			System.out.println(termo);
			mtpy *= termo;
		}
		System.out.println(mtpy);
	}
}
