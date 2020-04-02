/*
 * Laboratório de Programação 2 - Lab 1
 *
 * @author Franklin Regis de Oliveira - 119210030
 */

import java.util.Scanner;

public class filtroTemperatura{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int temperatura = 0, errados = 0;
		while(true){
			temperatura = sc.nextInt();
			if(temperatura == 0){break;}
			else if (temperatura < 0){errados += 1;}
		}
		System.out.println(errados);
		
	}
}
