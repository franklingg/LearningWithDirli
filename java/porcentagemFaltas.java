/*
 * Laboratório de Programação 2 - Lab 1
 *
 * @author Franklin Regis de Oliveira - 119210030
 */

import java.util.Scanner;

public class porcentagemFaltas{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int creditos = sc.nextInt();
		int faltas = sc.nextInt();
		int presenca = creditos * 18 - faltas;
		int porcentagem = (presenca * 100) / (creditos * 18);
		
		System.out.println(porcentagem + "%");
	}
}
