/*
 * Laboratório de Programação 2 - Lab 1
 *
 * @author Franklin Regis de Oliveira - 119210030
 */

import java.util.Scanner;

public class passagem{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int passagem = sc.nextInt();
		if (passagem > 10) {
			System.out.println("Passagem cara");
			System.out.println("Valor: " + passagem);
		} else if(passagem == 10) {
			System.out.println("Passagem ok");
		} else {
			System.out.println("Passagem barata");
			System.out.println("Valor: " + passagem);
		}
		System.out.println("Obrigado!");
	}
}
