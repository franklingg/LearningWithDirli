/**
* Laboratório de Programação 2 - Lab 1
*
* @author Franklin Regis de Oliveira - 119210030
*/

import java.util.Scanner;

public class sorVeTe{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int pos1 = sc.nextInt(), vel1 = sc.nextInt();
		int pos2 = sc.nextInt(), vel2 = sc.nextInt();
		int time = sc.nextInt();

		int diferenca = Math.abs(pos1 - pos2 + (vel1 - vel2) * time);
		System.out.println(diferenca);
	}
}
