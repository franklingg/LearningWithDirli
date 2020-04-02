/*
 * Laboratório de Programação 2 - Lab 1
 *
 * @author Franklin Regis de Oliveira - 119210030
 */

import java.util.Scanner;

public class sobrasLucroEmpresa{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int lucro = sc.nextInt();
		int func = sc.nextInt();
		int sobras = lucro % func;
		double preco = sc.nextDouble();
		int balinhas = (int) (sobras / preco);
		System.out.println(balinhas);

	}
}
